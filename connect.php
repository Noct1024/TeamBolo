<?php
    $host = "localhost";
    $user = "user";
    $pass = "password";
    $db = "donation";

  $conn = mysqli_connect("hostname", "username", "password", "database");

    if ($conn) {
        echo "connected to database";
    }else {
    echo "failed to connect" .mysqli_connect_error();
    }

    ?>
