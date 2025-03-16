<?php

require_once 'Date.php';

require_once __DIR__ . '/../../../../vendor/autoload.php';

use Ramsey\Uuid\Uuid;

/**
 * Class Official represents an official employee with salary and personal details.
 */
class Official extends Date
{
  // Private attributes
  private string $id;   // UUID for the official
  private string $official_id;
  private string $name;
  private float $basicSalary;

  // Static attribute for position allowance
  private static float $positionAllowance = 500.00;

  /**
   * Constructor to initialize an Official object.
   *
   * @param string $id Official ID (UUID).
   * @param string $name Official's name.
   * @param int $day Day of birth.
   * @param int $month Month of birth.
   * @param int $year Year of birth.
   * @param float $basicSalary Official's basic salary.
   */
  public function __construct(string $id, string $official_id, string $name, int $day, int $month, int $year, float $basicSalary)
  {
    parent::__construct($id, $day, $month, $year);
    $this->id = $id ?? Uuid::uuid4()->toString();
    $this->official_id = $official_id;
    $this->name = $name;
    $this->basicSalary = $basicSalary;
  }

  /**
   * Calculate the total salary (basic salary + position allowance).
   *
   * @return float The calculated total salary.
   */
  public function calculateSalary(): float
  {
    return $this->basicSalary + self::$positionAllowance;
  }

  /**
   * Get the official's details as an associative array.
   *
   * @return array Official's information.
   */
  public function getOfficialDetails(): array
  {
    return [
      "id" => $this->id,
      "official_id" => $this->official_id,
      "name" => $this->name,
      "date_of_birth" => $this->getDateString(),
      "basic_salary" => $this->basicSalary,
      "total_salary" => $this->calculateSalary()
    ];
  }

  /**
   * Set the position allowance (Static Method).
   *
   * @param float $amount New position allowance value.
   */
  public static function setPositionAllowance(float $amount)
  {
    self::$positionAllowance = $amount;
  }
}