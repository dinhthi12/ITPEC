<?php

/**
 * Class Date represents a date with day, month, and year attributes.
 */

require_once __DIR__ . '/../../../../vendor/autoload.php';

use Ramsey\Uuid\Uuid;


class Date
{
  //private attributes (not accessible outside the class)
  private string $id; //uuid
  private int $day;
  private int $month;
  private int $year;

  /**
   * Constructor to initialize a Date object.
   *
   * @param int $day Day of the date.
   * @param int $month Month of the date.
   * @param int $year Year of the date.
   */
  public function __construct(string $id, int $day, int $month, int $year)
  {
    $this->id = $id ?? Uuid::uuid4()->toString();
    $this->day = $day;
    $this->month = $month;
    $this->year = $year;
  }

  /**
   * Get the date as a formatted string.
   *
   * @return string Formatted date (DD/MM/YYYY).
   */
  public function getDateString(): string
  {
    return sprintf("%02d/%02d/%04d", $this->day, $this->month, $this->year);
  }

  /**
   * Get the date as an array.
   *
   * @return array Associative array with day, month, and year.
   */
  public function getDateArray(): array
  {
    return [
      "id" => $this->id,
      "day" => $this->day,
      "month" => $this->month,
      "year" => $this->year
    ];
  }
}