<?php
// On démarre une session
session_start();

if($_POST){
    if(isset($_POST['nom']) && !empty($_POST['nom'])
    && isset($_POST['prenom']) && !empty($_POST['prenom'])
    && isset($_POST['login']) && !empty($_POST['login']))
   // && isset($_POST['password']) && !empty($_POST['password']))
   {
        // On inclut la connexion à la base
        require_once('connect.php');

        // On nettoie les données envoyées
        $nom = strip_tags($_POST['nom']);
        $prenom = strip_tags($_POST['prenom']);
        $login = strip_tags($_POST['login']);
        $password = strip_tags($_POST['password']);

        $sql = 'INSERT INTO `users` (`nom`, `prenom`, `login` , `password`) VALUES (:nom, :prenom, :login, :password);';

        $query = $db->prepare($sql);

        $query->bindValue(':nom', $nom, PDO::PARAM_STR);
        $query->bindValue(':prenom', $prenom, PDO::PARAM_STR);
        $query->bindValue(':login', $login, PDO::PARAM_INT);
        $query->bindValue(':password', $password, PDO::PARAM_STR);

        $query->execute();

        $_SESSION['message'] = "nom ajouté";
        require_once('close.php');

        header('Location: index.php');
    }else{
        $_SESSION['erreur'] = "Le formulaire est incomplet";
    }
}

?>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ajouter un nom</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
    <main class="container">
        <div class="row">
            <section class="col-12">
                <?php
                    if(!empty($_SESSION['erreur'])){
                        echo '<div class="alert alert-danger" role="alert">
                                '. $_SESSION['erreur'].'
                            </div>';
                        $_SESSION['erreur'] = "";
                    }
                ?>
                <h1>Ajouter un nom</h1>
                <form method="post">
                    <div class="form-group">
                        <label for="nom">Nom</label>
                        <input type="text" id="nom" name="nom" class="form-control">
                    </div>
                    <div class="form-group">
                        <label for="prenom">Prenom</label>
                        <input type="text" id="prenom" name="prenom" class="form-control">

                    </div>
                    <div class="form-group">
                        <label for="login">Login</label>
                        <input type="text" id="login" name="login" class="form-control">
                    </div>
                    <div class="form-group">
                        <label for="password">password</label>
                        <input type="text" id="password" name="password" class="form-control">
                    </div>
                    <button class="btn btn-primary">Envoyer</button>
                </form>
            </section>
        </div>
    </main>
</body>
</html>