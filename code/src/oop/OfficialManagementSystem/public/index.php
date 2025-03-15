<?php
// Enable error reporting for debugging (Disable in production)
error_reporting(E_ALL);
ini_set('display_errors', 1);

// Autoload dependencies using Composer
require_once __DIR__ . '/../../../../vendor/autoload.php';

// Load the database connection file
require_once __DIR__ . '/../config/Database.php';

// Load the routing file
require_once __DIR__ . '/../routes/api.php';
