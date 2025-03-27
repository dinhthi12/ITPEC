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
   *
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

  /**
   * Search for an official by their official ID.
   *
   * This function retrieves an official's details from the repository based on the provided official ID.
   * It returns a JSON response with the official's information if found or an error message if not.
   */
  public function searchOfficialId(string $request)
  {
    // Set the response content type to JSON
    header('Content-Type: application/json');

    try {
      // Call the method to search for an official by official_id
      $officialListSearch = $this->officialRepository->searchByOfficialId($request);

      // If the official is found
      if ($officialListSearch) {
        http_response_code(200); // Set HTTP response code to 200 (OK)
        echo json_encode([
          "status" => "success", // Success status
          "data" => $officialListSearch // Return official data
        ]);
      } else {
        http_response_code(404); // Set HTTP response code to 404 (Not Found)
        echo json_encode([
          "status" => "error", // Error status
          "message" => "Official not found" // Error message
        ]);
      }

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