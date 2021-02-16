<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="nl">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>toevoegen verfmagazijn</title>
    <link rel="stylesheet" href="stijl.css">
</head>

<body>
<header>
    <H1>Games Library</H1>
    <nav>
        <ul>
            <li><a href="index.jsp">Home</a></li>
            <li><a href="overzicht.jsp">Overzicht</a></li>
            <li><a href="toevoegen.jsp">Toevoegen</a></li>
        </ul>
    </nav>
</header>

<main>
    <h2>Game Toevoegen</h2>
    <form>
        <div class="field">
            <label for="name_input">Naam:</label>
            <input id="name_input" type="text" name="game_name">
        </div>
        <div class="field">
            <label for="genre_input">Genre:</label>
            <input id="genre_input" type="text" name="game_genre">
        </div>
        <div class="field">
            <label for="prijs_input">Prijs:</label>
            <input id="prijs_input" type="number" name="game_prijs">
        </div>
        <div class="field">
            <label for="release_input">Release:</label>
            <input id="release_input" type="text" name="game_release">
        </div>

        <input type="submit" value="game_toevoegen">
    </form>
</main>
</body>
</html>