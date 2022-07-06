package service;

import javax.jws.*;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import javax.jws.WebMethod;

import metier.Connexion;
import metier.Etudiant;
@WebService(serviceName = "EtudiantWS")
public class EtudiantService {

	// *********READ*********
	@WebMethod
	public List<Etudiant> getEtudiants() {
		List<Etudiant> et = new ArrayList<>();
		try {
			Connection myCon = Connexion.getCon();
			PreparedStatement myStmt = myCon.prepareStatement("select id,prenom,nom from etudiant  ORDER BY id");
			ResultSet resultat = myStmt.executeQuery();
			while (resultat.next()) {
				et.add(new Etudiant(resultat.getInt("id"), resultat.getString("nom"), resultat.getString("prenom")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return et;
	}
	 // *********READ*********
	
	 // *********CREATE*********
	@WebMethod
	public String Create(String nom, String prenom) {
		try {

			String req = "INSERT INTO etudiant(nom,prenom)" + "VALUES (?, ?)";
			Connection myCon = Connexion.getCon();
			PreparedStatement preparedStatement = myCon.prepareStatement(req);
			preparedStatement.setString(1, nom);
			preparedStatement.setString(2, prenom);

			preparedStatement.executeUpdate();
			return "Insertion Reussie";
		} catch (SQLException e) {
			e.printStackTrace();
			return "Wchec de l'insertion";
		}

	}

	// // *********CREATE*********
	
	// // *********UPDATE*********
	@WebMethod
	public String Update(String nom, String prenom, int id) {
		try {
			String req = "UPDATE etudiant set nom=?,prenom=? where id=?";
			Connection myCon = Connexion.getCon();
			PreparedStatement preparedStatement = myCon.prepareStatement(req);
			preparedStatement.setString(1, nom);
			preparedStatement.setString(2, prenom);
			preparedStatement.setInt(3, id);

			preparedStatement.executeUpdate();
			return "Mise a jour effectue";
		} catch (SQLException e) {
			e.printStackTrace();
			return "Echec MAJ";
		}

	}

	// *********UPDATE*********
	// *********DELETE*********
	@WebMethod
	public String Delete(int id) {
		try {
			String req = "DELETE FROM etudiant WHERE  id=?";
			Connection myCon = Connexion.getCon();
			PreparedStatement preparedStatement = myCon.prepareStatement(req);
			preparedStatement.setInt(1, id);
			preparedStatement.execute();
			return "Suppression Effectuee avec succes";
		} catch (SQLException e) {
			e.printStackTrace();
			return "Echec de la supression";
		}

	}
	@WebMethod
	public boolean Del(int id) {
		try {
			String req = "DELETE FROM etudiant WHERE  id=?";
			Connection myCon = Connexion.getCon();
			PreparedStatement preparedStatement = myCon.prepareStatement(req);
			preparedStatement.setInt(1, id);
			preparedStatement.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}
	// *********DELETE*********

}
