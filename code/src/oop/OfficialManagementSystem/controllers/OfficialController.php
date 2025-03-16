<?php

require_once '../repositories/OfficialRepository.php';

/**
 * OfficialController handles API requests related to officials.
 */
class OfficialController
{
  private OfficialRepository $officialRepository;

  public function __construct()
  {
    $this->officialRepository = new OfficialRepository();
  }

  /**
   * Fetch all officials.
   * This is a test method to check if the API is working correctly.
   * It returns a JSON response indicating success.
   */
  public function getAllOfficials()
  {
    // Set the response content type to JSON
    header('Content-Type: application/json');

    try {
      // Fetch all officials from the repository
      $officials = $this->officialRepository->getAllOfficials();

      // Return a successful JSON response with the retrieved data
      echo json_encode([
        "status" => "success",
        "data" => $officials
      ]);
    } catch (Exception $e) {
      // Set HTTP response code to 500 (Internal Server Error)
      http_response_code(500);

      // Return an error response with the exception message
      echo json_encode([
        "status" => "error",
        "message" => $e->getMessage()
      ]);
    }
  }
}
