<?php

// Load the Composer autoloader to enable class auto-loading
require_once __DIR__ . '/../../../../vendor/autoload.php';

use Dotenv\Dotenv;

/**
 * Database connection class using PDO and environment variables.
 */
class Database
{
  // Holds the database connection instance
  private static $connection = null;

  /**
   * Establish a database connection using credentials from environment variables.
   *
   * @return PDO The database connection instance.
   */
  public static function connect()
  {
    // Check if the connection has already been established
    if (self::$connection === null) {
      try {
        // Load environment variables from the .env file
        $dotenv = Dotenv::createImmutable(__DIR__ . '/../');
        $dotenv->load();

        // Retrieve database credentials from environment variables
        $host = $_ENV['DB_HOST'];
        $dbname = $_ENV['DB_NAME'];
        $username = $_ENV['DB_USERNAME'];
        $password = $_ENV['DB_PASSWORD'];

        // Create a new PDO instance with PostgreSQL configuration
        self::$connection = new PDO(
          "pgsql:host=$host;dbname=$dbname;options='--client_encoding=UTF8'",
          $username,
          $password,
          [PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION] // Enable error reporting as exceptions
        );
      } catch (PDOException $e) {
        // Display an error message if the connection fails
        die("Database Connection Error: " . $e->getMessage());
      }
    }
    return self::$connection; // Return the database connection instance
  }

  /**
   * Close the database connection by setting it to null.
   */
  public static function disconnect()
  {
    self::$connection = null;
  }
}
