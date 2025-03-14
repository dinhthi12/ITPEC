<?php
require_once 'connection.php';

try {
    $db = Database::connect();
    echo "✅ PostgreSQL Connection Successful!";
    Database::disconnect();
} catch (Exception $e) {
    echo "❌ Connection Failed: " . $e->getMessage();
}
?>
