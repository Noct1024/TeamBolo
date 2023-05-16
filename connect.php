<?php
    $host = "localhost";
    $user = "user";
    $pass = "password";
    $db = "donation";

  $conn = mysqli_connect($host, $user, $pass, $db);

    if ($conn) {
        echo "connected to database";
    }else {
    echo "failed to connect" .mysqli_connect_error();
    }

    ?>
