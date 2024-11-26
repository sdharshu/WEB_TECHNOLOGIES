<?php
// Load the XML file
$xml = simplexml_load_file('monuments.xml') or die("Error: Cannot create object");

// Display the data
echo "<h1>Monuments of Tamil Nadu</h1>";
echo "<ul>";

// Iterate through each monument in the XML file
foreach ($xml->monument as $monument) {
    echo "<li>";
    echo "<h2>" . $monument->name . "</h2>";
    echo "<p><strong>Location:</strong> " . $monument->location . "</p>";
    echo "<p><strong>Description:</strong> " . $monument->description . "</p>";
    echo "</li>";
}

echo "</ul>";
?>
