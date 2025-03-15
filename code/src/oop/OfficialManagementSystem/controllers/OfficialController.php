<?php

class OfficialController {
  public function getAllOfficials(){
    header('Content-Type: application/json');

    // Trả về JSON để kiểm tra API hoạt động
    echo json_encode([
        "status" => "success",
        "message" => "API getAllOfficial is working!"
    ]);
  }
}