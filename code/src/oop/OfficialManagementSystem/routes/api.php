<?php

// Include the OfficialController to handle requests related to officials
require_once '../controllers/OfficialController.php';

// Get the request URI and HTTP method (GET, POST, PUT, DELETE)
$uri = parse_url($_SERVER['REQUEST_URI'], PHP_URL_PATH);
$method = $_SERVER['REQUEST_METHOD'];

// Create an instance of OfficialController to process the request
$officialController = new OfficialController();

// Configure CORS to allow access from any origin (*)
header("Access-Control-Allow-Origin: *");
header("Access-Control-Allow-Methods: GET, POST, PUT, DELETE");
header("Access-Control-Allow-Headers: Content-Type");

// Handle requests based on the URI
switch ($uri) {

  // Retrieve all officials (GET) or create a new official (POST)
  case '/api/officials':
    if ($method === 'GET') {
      $officialController->getAllOfficials(); // Call the method to fetch the list of officials
    } elseif ($method === 'POST') {
      // Handle creating a new official (not yet implemented)
    }
    break;

  // Handle requests related to a specific official by ID
  case preg_match('/^\/api\/officials\/([a-f0-9\-]+)$/', $uri, $matches) ? true : false:
    $officialId = $matches[1]; // Extract the official ID from the URL

    if ($method === 'GET') {
      // Handle fetching details of a specific official (not yet implemented)
    } elseif ($method === 'PUT') {
      // Handle updating an official's information (not yet implemented)
    } elseif ($method === 'DELETE') {
      // Handle deleting an official (not yet implemented)
    }
    break;

  // API endpoint to fetch officials with the lowest salary
  case '/api/officials/lowest-salary':
    if ($method === 'GET') {
      // Handle fetching officials with the lowest salary (not yet implemented)
    }
    break;

  // Return a 404 error if no valid route is matched
  default:
    http_response_code(404);
    echo json_encode(["error" => "Not Found"]);
    break;
}
