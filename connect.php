<?php
define( 'dbhost' , 'localhost');
define( 'dbuser' , 'root');
define( 'dbpass' , '');
define( 'dbname' , 'DonateDB');

$conn = mysli_connect(dbhost, dbuser, dbpass) or die('unable to connect');

?>
