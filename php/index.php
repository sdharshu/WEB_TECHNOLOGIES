<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Monuments of Tamil Nadu</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        .container {
            max-width: 800px;
            margin: 20px auto;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
        }

        h1 {
            text-align: center;
            color: #333;
        }

        .monument {
            border-bottom: 1px solid #ccc;
            padding: 10px 0;
        }

        .monument img {
            max-width: 100%;
            height: auto;
            margin-bottom: 10px;
        }

        .monument h2 {
            color: #555;
            margin-bottom: 5px;
        }

        .monument p {
            color: #777;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Monuments of Tamil Nadu</h1>
        <?php
        // Database connection
        $servername = "localhost";
        $username = "root"; // Default username in XAMPP is 'root'
        $password = ""; // Default password in XAMPP is empty
        $dbname = "tamilnadu_monuments";

        // Create a connection
        $conn = new mysqli($servername, $username, $password, $dbname);

        // Check the connection
        if ($conn->connect_error) {
            die("Connection failed: " . $conn->connect_error);
        }

        // Fetch data from the database
        $sql = "SELECT name, location, description, image_url FROM monuments";
        $result = $conn->query($sql);

        if ($result->num_rows > 0) {
            // Output data for each row
            while ($row = $result->fetch_assoc()) {
                echo '<div class="monument">';
                if (!empty($row["image_url"])) {
                    echo '<img src="' . $row["image_url"] . '" alt="' . $row["name"] . '">';
                }
                echo '<h2>' . $row["name"] . '</h2>';
                echo '<p><strong>Location:</strong> ' . $row["location"] . '</p>';
                echo '<p>' . $row["description"] . '</p>';
                echo '</div>';
            }
        } else {
            echo "<p>No monuments found.</p>";
        }

        // Close the connection
        $conn->close();
        ?>
    </div>
</body>
</html>
