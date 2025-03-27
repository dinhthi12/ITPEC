<?php

require_once '../config/Database.php';

class OfficialRepository
{
  private PDO $db;

  /**
   * Constructor to initialize database connection
   */
  public function __construct()
  {
    $this->db = Database::connect();
  }

  /**
   * Retrieve all officials from the database
   *
   * @return array List of officials with their details
   */
  public function getAllOfficials(): array
  {
    // SQL query to join officials table with dates table to get full details
    $query = "SELECT o.id, o.official_id, o.name, d.day, d.month, d.year, o.basic_salary, o.position_allowance
              FROM officials o
              JOIN dates d ON o.date_of_birth = d.id";

    // Prepare and execute the query
    $stmt = $this->db->prepare($query);
    $stmt->execute();

    // Fetch all results as an associative array
    return $stmt->fetchAll(PDO::FETCH_ASSOC);
  }

  /**
   * Search for an official by official_id
   *
   * @param string $officialId The official ID to search for
   * @return array|null The official details if found, otherwise null
   */
  public function searchByOfficialId(string $officialId): ?array
  {
    $query = "SELECT o.id, o.official_id, o.name, d.day, d.month, d.year, o.basic_salary, o.position_allowance
              FROM officials o
              JOIN dates d ON o.date_of_birth = d.id
              WHERE o.official_id = :official_id";

    $stmt = $this->db->prepare($query);
    $stmt->bindValue(':official_id', $officialId, PDO::PARAM_STR);
    $stmt->execute();

    $result = $stmt->fetch(PDO::FETCH_ASSOC);
    return $result ?: null;
  }
}
