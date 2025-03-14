<?php

class Database
{
  private static $host = "localhost";
  private static $dbname = "";
  private static $username = "";
  private static $password = "";
  private static $connection = null;

  public static function connect()
  {
    if (self::$connection === null) {
      try {
        self::$connection = new PDO(
          "pgsql:host=" . self::$host . ";dbname=" . self::$dbname . ";options='--client_encoding=UTF8'",
          self::$username,
          self::$password,
          [PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION]
        );
      } catch (PDOException $e) {
        die("Database Connection Error: " . $e->getMessage());
      }
    }
    return self::$connection;
  }

  public static function disconnect()
  {
    self::$connection = null;
  }
}
?>
