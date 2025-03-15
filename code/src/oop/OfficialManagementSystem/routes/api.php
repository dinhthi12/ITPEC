<?php

require_once '../controllers/OfficialController.php';

$uri = parse_url($_SERVER['REQUEST_URI'], PHP_URL_PATH);
$method = $_SERVER['REQUEST_METHOD'];

$officialController = new OfficialController();

header("Access-Control-Allow-Origin: *");
header("Access-Control-Allow-Methods: GET, POST, PUT, DELETE");
header("Access-Control-Allow-Headers: Content-Type");

switch ($uri) {
  case '/api/officials':
    if ($method === 'GET') {
      $officialController->getAllOfficials();
    } elseif ($method === 'POST') {
      //
    }
    break;

  case preg_match('/^\/api\/officials\/([a-f0-9\-]+)$/', $uri, $matches) ? true : false:
    $officialId = $matches[1];

    if ($method === 'GET') {
      //
    } elseif ($method === 'PUT') {
      //
    } elseif ($method === 'DELETE') {
      //
    }
    break;

  case '/api/officials/lowest-salary':
    if ($method === 'GET') {
      //
    }
    break;

  default:
    http_response_code(404);
    echo json_encode(["error" => "Not Found"]);
    break;
}
