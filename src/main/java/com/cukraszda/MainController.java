package com.cukraszda;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.functions.SMO;
import weka.classifiers.lazy.IBk;
import weka.classifiers.trees.J48;
import weka.classifiers.trees.RandomForest;
import weka.core.Utils;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URL;
import java.sql.*;
import java.util.*;


public class MainController implements Initializable {
    @FXML public TableView tv1;
    @FXML public GridPane gr1;
    @FXML public GridPane gr2;
    @FXML public GridPane gr3;
    @FXML public GridPane gr4;
    @FXML public GridPane gr5;
    @FXML public GridPane gr6;
    @FXML public GridPane gr7;
    @FXML public GridPane gr8;
    @FXML public GridPane gr9;
    @FXML public GridPane gr10;
    @FXML public GridPane gr11;
    @FXML public GridPane gr12;
    @FXML public GridPane gr13;
    @FXML public GridPane gr14;
    @FXML public GridPane gr15;
    @FXML public GridPane gr16;
    @FXML public GridPane gr17;
    @FXML public GridPane gr18;
    @FXML public TextField tf1;
    @FXML public TextField tf2;
    @FXML public TextField tf3;
    @FXML public TextField tf4;
    @FXML public TextField tf5;
    @FXML public TextField tf6;
    @FXML public TextField tf7;
    @FXML public TextField tf8;
    @FXML public TextField tf9;
    @FXML public TextField tf10;
    @FXML public TextField tf11;
    @FXML public TextField tf12;
    @FXML public TextField tf13;
    @FXML public TextField tf14;
    @FXML public TextField tf15;
    @FXML public TextField tf16;
    @FXML public TextField tf17;
    @FXML public TextField tf18;
    @FXML public TextField tf19;
    @FXML public TextField tf20;
    @FXML public TextField tf21;
    @FXML public TextField tf22;
    @FXML public TextField tf23;
    @FXML public TextArea ta1;
    @FXML public TextArea ta2;
    @FXML public TextArea ta3;
    @FXML public TextArea ta4;
    @FXML public TextArea ta5;
    @FXML public TextArea ta6;
    @FXML public TextArea ta7;
    @FXML public TextArea ta8;
    @FXML public TextArea ta9;
    @FXML public TextArea ta10;
    @FXML public TextArea ta11;
    @FXML public ComboBox cb1;
    @FXML public ComboBox cb2;
    @FXML public ComboBox cb3;
    @FXML public ComboBox cb4;
    @FXML public ComboBox cb5;



    @FXML public ToggleGroup group;
    @FXML public Button btnSzuro;
    @FXML public Label errorForSzures;
    @FXML public Label errorForsutizoHozzaadas;
    @FXML public Label msgForsutizoHozzaadas;
    @FXML public Label errorForsutizoModositas;
    @FXML public Label msgForsutizoModositas;
    @FXML public Label msgForsutiTorles;
    @FXML public Label errorForsutiTorles;
    @FXML public Label errorForsutiTorles2;
    @FXML public Label döntésiFaMsg;
    @FXML public TableColumn<suti, Integer> sutiidcol;
    @FXML public TableColumn<suti, String> nevCol;
    @FXML public TableColumn<suti, String> tipuscol;
    @FXML public TableColumn<suti, Integer> sutitartazoncol;
    @FXML public TableColumn<suti, String> sutitartnevcol;
    @FXML public TableColumn<suti, Integer> sutimaxarcol;
    @FXML public TableColumn<suti, Integer> sutiminarcol;
    @FXML public TableColumn<suti, Integer> sutiosszeseladascol;
    @FXML public TableColumn<suti, Integer> varoseladascol;


    SessionFactory factory;
    Connection connection;
    Statement statement;
    PreparedStatement preparedStatement;
    final String token = "cf80eff8acb5840b59b220e16e409ea4589bae9a86bc4a4cf4c806f8edfe23b8";
    HttpsURLConnection httpsURLConnection;
    protected void ElemekTörlése() {
        gr1.setVisible(false);
        gr1.setManaged(false);
        gr2.setVisible(false);
        gr2.setManaged(false);
        gr3.setVisible(false);
        gr3.setManaged(false);
        gr4.setVisible(false);
        gr4.setManaged(false);
        gr5.setVisible(false);
        gr5.setManaged(false);
        gr6.setVisible(false);
        gr6.setManaged(false);
        gr7.setVisible(false);
        gr7.setManaged(false);
        gr8.setVisible(false);
        gr8.setManaged(false);
        gr9.setVisible(false);
        gr9.setManaged(false);
        gr10.setVisible(false);
        gr10.setManaged(false);
        gr11.setVisible(false);
        gr11.setManaged(false);
        gr12.setVisible(false);
        gr12.setManaged(false);
        gr13.setVisible(false);
        gr13.setManaged(false);
        gr14.setVisible(false);
        gr14.setManaged(false);
        gr15.setVisible(false);
        gr15.setManaged(false);
        gr16.setVisible(false);
        gr16.setManaged(false);
        gr17.setVisible(false);
        gr17.setManaged(false);
        gr18.setVisible(false);
        gr18.setManaged(false);
        tv1.setVisible(false);
        tv1.setManaged(false);
        errorForSzures.setVisible(false);
        errorForSzures.setManaged(false);
        errorForsutizoHozzaadas.setVisible(false);
        errorForsutizoHozzaadas.setManaged(false);
        msgForsutizoHozzaadas.setVisible(false);
        msgForsutizoHozzaadas.setManaged(false);
        errorForsutizoModositas.setVisible(false);
        errorForsutizoModositas.setManaged(false);
        msgForsutizoModositas.setVisible(false);
        msgForsutizoModositas.setManaged(false);
        msgForsutiTorles.setVisible(false);
        msgForsutiTorles.setManaged(false);
        errorForsutiTorles.setVisible(false);
        errorForsutiTorles.setManaged(false);
        errorForsutiTorles2.setVisible(false);
        errorForsutiTorles2.setManaged(false);
    }
    @FXML
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ElemekTörlése();
        cb5.getItems().addAll("Döntési fa", "Support-vector machine", "NaiveBayes", "K-legközelebbi szomszéd", "RandomForest");
        cb5.getSelectionModel().select("Döntési fa");
        try {
            initConfig();
        } catch (RuntimeException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiba");
            alert.setHeaderText("Adatbázishoz való kapcsolódási hiba");
            alert.setContentText("Hiba történt az adatbázishoz való kapcsolódáskor. Kérjük, ellenőrizze az adatbázis elérési útvonalát vagy a hiba részleteit a naplófájlban.");

            e.printStackTrace(); // Opcionálisan logolás a hibával

            alert.showAndWait();
        }
    }

    protected void initConfig() {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        factory = cfg.buildSessionFactory();

        final String URL = "jdbc:sqlite:C:/adatbazis/cukraszda.db";

        // Az SQLite kapcsolat inicializálása
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(URL);
            statement = connection.createStatement();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace(); // Hibakezelés vagy logolás
        }
    }


    protected void clearControlUIData(TextField... tfList) {
        for(TextField tf : tfList) tf.setText("");
    }
    protected void setTimerForLabel(Label label) {
        Timer tm = new Timer();
        tm.schedule(new TimerTask(){
            @Override
            public void run() {
                Platform.runLater(() -> {
                    label.setText("");
                });
            }
        },3000);
    }
    protected void initTable() {
        ElemekTörlése();
        tv1.setVisible(true);
        tv1.setManaged(true);
        tv1.getColumns().removeAll(tv1.getColumns());
        tv1.getItems().removeAll(tv1.getItems());
        sutiidcol = new TableColumn("Süti ID");
        nevCol = new TableColumn("Sütemény Neve");
        tipuscol = new TableColumn("Sütemény Típusa");
        sutitartazoncol = new TableColumn<>("Süti_tartalom ID");
        sutitartnevcol = new TableColumn<>("Mentes");
        sutimaxarcol = new TableColumn<>("MAX ára az elmúlt évben");
        sutiminarcol = new TableColumn<>("MIN ára az elmúlt évben");
        sutiosszeseladascol = new TableColumn<>("Összes eladás.");
        varoseladascol = new TableColumn<>("Városunkban lévő eladások");

        tv1.getColumns().addAll(sutiidcol, nevCol, tipuscol, sutitartazoncol, sutitartnevcol, sutimaxarcol, sutiminarcol, sutiosszeseladascol, varoseladascol);
        sutiidcol.setCellValueFactory(new PropertyValueFactory<>("id"));
        nevCol.setCellValueFactory(new PropertyValueFactory<>("nev"));
        tipuscol.setCellValueFactory(new PropertyValueFactory<>("tipus"));
        sutitartazoncol.setCellValueFactory(new PropertyValueFactory<>("t_id"));
        sutitartnevcol.setCellValueFactory(new PropertyValueFactory<>("tartalomNev"));
        sutimaxarcol.setCellValueFactory(new PropertyValueFactory<>("armin"));
        sutiminarcol.setCellValueFactory(new PropertyValueFactory<>("armax"));
        sutiosszeseladascol.setCellValueFactory(new PropertyValueFactory<>("sutidb"));
        varoseladascol.setCellValueFactory(new PropertyValueFactory<>("tartalomdb"));
        sutiidcol.prefWidthProperty().bind(tv1.widthProperty().multiply(0.1));
        nevCol.prefWidthProperty().bind(tv1.widthProperty().multiply(0.1));
        sutitartazoncol.prefWidthProperty().bind(tv1.widthProperty().multiply(0.12));
        sutitartnevcol.prefWidthProperty().bind(tv1.widthProperty().multiply(0.1));
        sutimaxarcol.prefWidthProperty().bind(tv1.widthProperty().multiply(0.13));
        sutiminarcol.prefWidthProperty().bind(tv1.widthProperty().multiply(0.13));
        sutiosszeseladascol.prefWidthProperty().bind(tv1.widthProperty().multiply(0.13));
        varoseladascol.prefWidthProperty().bind(tv1.widthProperty().multiply(0.13));
    }
    @FXML
    protected void menuReadClick() throws SQLException {
        initTable();

        ResultSet sutiadatokSorai = statement.executeQuery("SELECT suti.id, suti.nev, suti.tipus, tartalom.t_id ,tartalom.tartalomNev , tartalom.armin, tartalom.armax, reszlet.sutidb, reszlet.tartalomdb FROM reszlet inner join suti on reszlet.sutiid = suti.id inner join tartalom on reszlet.tartalomid = tartalom.t_id");
        suti sutiadatok;
        while(sutiadatokSorai.next()) {
            sutiadatok = new suti(sutiadatokSorai.getInt("id"), sutiadatokSorai.getString("nev"), sutiadatokSorai.getString( "tipus"), sutiadatokSorai.getInt("t_id"), sutiadatokSorai.getString("tartalomNev"), sutiadatokSorai.getInt("armin"), sutiadatokSorai.getInt("armax"), sutiadatokSorai.getInt("sutidb"), sutiadatokSorai.getInt("tartalomdb"));
            tv1.getItems().add(sutiadatok);
        }
    }
    @FXML
    protected void menuRead2Click() {
        initTable();
        tv1.getItems().removeAll(tv1.getItems());
        gr1.setVisible(true);
        gr1.setManaged(true);



        tf1.setText("");
    }
    @FXML
    protected void menuWriteClick() {
        ElemekTörlése();
        gr2.setVisible(true);
        gr2.setManaged(true);

    }
    @FXML
    protected void menuUpdateClick() throws SQLException {
        ElemekTörlése();
        gr3.setVisible(true);
        gr3.setManaged(true);
        cb2.getItems().removeAll(cb2.getItems());
        ResultSet sutiAzonositok = statement.executeQuery("SELECT id FROM suti");
        while(sutiAzonositok.next()) {
            cb2.getItems().add(sutiAzonositok.getInt("id"));
        }
        cb2.getSelectionModel().select("1");
    }
    @FXML
    protected void menuDeleteClick() throws SQLException {
        ElemekTörlése();
        gr4.setVisible(true);
        gr4.setManaged(true);
        cb3.getItems().removeAll(cb3.getItems());
        cb4.getItems().removeAll(cb4.getItems());
        ResultSet tartalomAzonositok = statement.executeQuery("SELECT DISTINCT t_id FROM tartalom");
        int va = 0;
        while(tartalomAzonositok.next()) {
            cb3.getItems().add(tartalomAzonositok.getInt("t_id"));
            int firstNum = tartalomAzonositok.getInt("t_id");
            if(va == 0) cb3.getSelectionModel().select(firstNum);
            va++;
        }
        ResultSet reszletAzonositok = statement.executeQuery("SELECT DISTINCT tartalomid FROM reszlet");
        int vt = 0;
        while(reszletAzonositok.next()) {
            cb4.getItems().add(reszletAzonositok.getInt("tartalomid"));
            int firstNum = reszletAzonositok.getInt("tartalomid");
            if(vt == 0) cb4.getSelectionModel().select(firstNum);
            vt++;
        }
    }

    @FXML
    protected void btnSzuro() throws SQLException {
        // Kinyerted a felhasználó által megadott sütinevet egy TextField-ből (feltételezve, hogy txtSutiNev a TextField neve)
        String sutiNev = tf1.getText();

        // Ellenőrzés, hogy a sütinev ne legyen null vagy üres
        if (sutiNev == null || sutiNev.trim().isEmpty()) {
            // Ha üres vagy null, akkor hibaüzenetet jeleníthetsz meg, és kiléphet a metódusból
            errorForSzures.setText("Kérlek add meg a sütinevet!");
            errorForSzures.setVisible(true);
            errorForSzures.setManaged(true);
            return;
        }

        // Tisztítjuk a táblát a korábbi eredményektől
        tv1.getItems().removeAll(tv1.getItems());

        try {
            // Előkészítjük a lekérdezést, amely tartalmazza a szűrőfeltételt
            String preparedQuery = "SELECT suti.id, suti.nev, suti.tipus, tartalom.t_id, tartalom.tartalomNev, tartalom.armin, tartalom.armax, reszlet.sutidb, reszlet.tartalomdb FROM reszlet INNER JOIN suti ON reszlet.sutiid = suti.id INNER JOIN tartalom ON reszlet.tartalomid = tartalom.t_id WHERE suti.nev = ?";
            preparedStatement = connection.prepareStatement(preparedQuery);
            preparedStatement.setString(1, sutiNev);

            // Lekérdezzük az adatokat és hozzáadjuk a táblához
            ResultSet sutiadatokSorai = preparedStatement.executeQuery();
            while (sutiadatokSorai.next()) {
                suti sutiadatok = new suti(
                        sutiadatokSorai.getInt("id"),
                        sutiadatokSorai.getString("nev"),
                        sutiadatokSorai.getString("tipus"),
                        sutiadatokSorai.getInt("t_id"),
                        sutiadatokSorai.getString("tartalomNev"),
                        sutiadatokSorai.getInt("armin"),
                        sutiadatokSorai.getInt("armax"),
                        sutiadatokSorai.getInt("sutidb"),
                        sutiadatokSorai.getInt("tartalomdb")
                );
                tv1.getItems().add(sutiadatok);
            }

            // Ha nincs találat, akkor hibaüzenetet jeleníthetsz meg
            if (!tv1.getItems().isEmpty()) {
                errorForSzures.setVisible(false);
                errorForSzures.setManaged(false);
            } else {
                errorForSzures.setText("Nincs találat a megadott sütinevre!");
                errorForSzures.setVisible(true);
                errorForSzures.setManaged(true);
            }
        } catch (SQLException e) {
            // Kezeld az esetleges kivételeket, például jeleníts meg egy hibaüzenetet
            e.printStackTrace();
            // vagy dobhatod a kivételt tovább a hívó kódnak
            throw e;
        }
    }

    @FXML
    protected void btnsutihozzaad() {
        if(tf2.getText().isEmpty() || tf3.getText().isEmpty()) {
            showError("Minden mezőt ki kell tölteni!");
        } else {
            try {
                String insertQuery = "INSERT INTO suti (id, nev, tipus) VALUES (?, ?, ?)";

                try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:/adatbazis/cukraszda.db");
                     PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

                    // új ID-t az adatbázisban lévő maximális érték alapján
                    int newId = calculateNewId(); // Ezt a metódust az aktuális maximum id meghatározására használhatod

                    preparedStatement.setInt(1, newId); // Adjuk hozzá a kézzel kiszámolt új ID-t
                    preparedStatement.setString(2, tf2.getText());
                    preparedStatement.setString(3, tf3.getText());

                    int affectedRows = preparedStatement.executeUpdate();

                    if (affectedRows > 0) {
                        showSuccess("Adat felvéve az adatbázisba!");
                        setTimerForLabel(msgForsutizoHozzaadas);
                        tf2.setText("");
                        tf3.setText("");
                    } else {
                        showError("Az adat beszúrása nem sikerült.");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
                showError("Adatbázis hiba: " + e.getMessage());
            }
        }
    }
    private void showError(String errorMessage) {
        System.err.println("Hiba: " + errorMessage);
    }
    private void showSuccess(String successMessage) {
        System.out.println("Siker: " + successMessage);
    }



    private int calculateNewId() throws SQLException {
        int newId = 0;
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:/adatbazis/cukraszda.db");
             Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery("SELECT MAX(id) FROM suti");
            if (resultSet.next()) {
                newId = resultSet.getInt(1) + 1; // Számold ki az új ID-t a maximumból plusz egy
            }
        }
        return newId;
    }

    @FXML
    protected void btnsutimodosit() throws SQLException {
        if(tf4.getText().length() == 0 && tf5.getText().length() == 0) {
            errorForsutizoModositas.setVisible(true);
            errorForsutizoModositas.setManaged(true);
            msgForsutizoModositas.setVisible(false);
            msgForsutizoModositas.setManaged(false);
        } else {
            errorForsutizoModositas.setVisible(false);
            errorForsutizoModositas.setManaged(false);
            String sutAzonosito = cb2.getValue() + "";
            if(tf4.getText().length() != 0) {
                preparedStatement = connection.prepareStatement("UPDATE suti SET nev = ? WHERE id = ?");
                preparedStatement.setString(1, tf4.getText());
                preparedStatement.setString(2, sutAzonosito);
                preparedStatement.executeUpdate();
            }
            if(tf5.getText().length() != 0) {
                preparedStatement = connection.prepareStatement("UPDATE suti SET tipus = ? WHERE id = ?");
                preparedStatement.setString(1, tf5.getText());
                preparedStatement.setString(2, sutAzonosito);
                preparedStatement.executeUpdate();
            }
            msgForsutizoModositas.setVisible(true);
            msgForsutizoModositas.setManaged(true);
            setTimerForLabel(msgForsutizoModositas);
            tf4.setText("");
            tf5.setText("");
        }
    }
    @FXML
    protected void btnSutiTorol() throws SQLException {
        if(cb3.getValue() == null || cb4.getValue() == null) {
            msgForsutiTorles.setVisible(false);
            msgForsutiTorles.setManaged(false);
            errorForsutiTorles2.setVisible(false);
            errorForsutiTorles2.setManaged(false);
            errorForsutiTorles.setVisible(true);
            errorForsutiTorles.setManaged(true);
        } else {
            preparedStatement = connection.prepareStatement("DELETE FROM suti WHERE id = ? ");
            preparedStatement.setString(1, cb3.getValue() + "");
            errorForsutiTorles.setVisible(false);
            errorForsutiTorles.setManaged(false);
            errorForsutiTorles2.setVisible(false);
            errorForsutiTorles2.setManaged(false);
            if(preparedStatement.executeUpdate() == 0) {
                errorForsutiTorles2.setVisible(true);
                errorForsutiTorles2.setManaged(true);
            } else {
                msgForsutiTorles.setVisible(true);
                msgForsutiTorles.setManaged(true);
                setTimerForLabel(msgForsutiTorles);
            };
        }
        cb3.getItems().removeAll(cb3.getItems());
        cb4.getItems().removeAll(cb4.getItems());
        ResultSet sutiAzonositok = statement.executeQuery("SELECT DISTINCT id FROM suti");
        int va = 0;
        while(sutiAzonositok.next()) {
            cb3.getItems().add(sutiAzonositok.getInt("id"));
            int firstNum = sutiAzonositok.getInt("id");
            if(va == 0) cb3.getSelectionModel().select(firstNum);
            va++;
        }
        ResultSet sutiTartalomazonositok = statement.executeQuery("SELECT DISTINCT t_id FROM tartalom");
        int vt = 0;
        while(sutiTartalomazonositok.next()) {
            cb4.getItems().add(sutiTartalomazonositok.getInt("t_id"));
            int firstNum = sutiTartalomazonositok.getInt("t_id");
            if(vt == 0) cb4.getSelectionModel().select(firstNum);
            vt++;
        }
    }
    protected void segéd1(){
        httpsURLConnection.setRequestProperty("Content-Type", "application/json");
        httpsURLConnection.setRequestProperty("Authorization", "Bearer " + token);
        httpsURLConnection.setUseCaches(false);
        httpsURLConnection.setDoOutput(true);
    }
    protected void segéd2(String params) throws IOException {
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(httpsURLConnection.getOutputStream(), "UTF-8"));
        wr.write(params);
        wr.close();
        httpsURLConnection.connect();
    }
    protected String segéd3(int code) throws IOException {
        int statusCode = httpsURLConnection.getResponseCode();
        System.out.println("statusCode: "+statusCode);
        if (statusCode == code) {
            BufferedReader in = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
            StringBuilder jsonResponseData = new StringBuilder();
            String readLine = null;
            while ((readLine = in.readLine()) != null)
                jsonResponseData.append(readLine);
            in.close();
            httpsURLConnection.disconnect();
            return jsonResponseData.toString();
        } else {
            httpsURLConnection.disconnect();
            return "Hiba!!!";
        }
    }
    @FXML
    protected void rest1MenuCreateClick() {
        ElemekTörlése();
        clearControlUIData(tf7, tf8, tf9, tf10);
        ta2.setText("");
        gr7.setVisible(true);
        gr7.setManaged(true);
    }
    @FXML
    protected void btnRest1MenuCreateClick() throws IOException {
        ta2.setText("");
        URL postUrl = new URL("https://gorest.co.in/public/v1/users");
        httpsURLConnection = (HttpsURLConnection) postUrl.openConnection();
        httpsURLConnection.setRequestMethod("POST");
        segéd1();
        String name = tf7.getText();
        String gender = tf8.getText();
        String email = tf9.getText();
        String status = tf10.getText();
        String params = "{\"name\":\""+name+"\", \"gender\":\""+gender+"\", \"email\":\""+email+"\", \"status\":\""+status+"\"}";
        segéd2(params);
        String response = segéd3(HttpsURLConnection.HTTP_CREATED);
        if(!response.equals("Hiba!!!")) {
            ta2.setText(response);
        } else {
            ta2.setText("Az új user létrehozása sajnos nem sikerült.");
        }
    }
    @FXML
    protected void rest1MenuReadClick() {
        ElemekTörlése();
        clearControlUIData(tf6);
        ta1.setText("");
        gr6.setVisible(true);
        gr6.setManaged(true);
    }
    @FXML
    protected void btnRest1MenuReadClick() throws IOException {
        ta1.setText("");
        String url = "https://gorest.co.in/public/v1/users";
        String ID = tf6.getText();
        if(ID != null)
            url = url + "/" + ID;
        URL usersUrl = new URL(url);
        httpsURLConnection = (HttpsURLConnection) usersUrl.openConnection();
        httpsURLConnection.setRequestMethod("GET");
        if(ID != null)
            httpsURLConnection.setRequestProperty("Authorization", "Bearer " + token);
        String response = segéd3(HttpsURLConnection.HTTP_OK);
        if(!response.equals("Hiba!!!")) {
            ta1.setText(response);
        } else {
            ta1.setText("Nincs user ilyen ID-val az adatbázisban.");
        }
    }
    @FXML
    protected void rest1MenuUpdateClick() {
        ElemekTörlése();
        clearControlUIData(tf11, tf12, tf13, tf14, tf15);
        ta3.setText("");
        gr8.setVisible(true);
        gr8.setManaged(true);
    }
    @FXML
    protected void btnRest1MenuUpdateClick() throws IOException {
        ta3.setText("");
        String ID = tf11.getText();
        String name = tf12.getText();
        String gender = tf13.getText();
        String email = tf14.getText();
        String status = tf15.getText();
        String url = "https://gorest.co.in/public/v1/users"+"/"+ID;
        URL postUrl = new URL(url);
        httpsURLConnection = (HttpsURLConnection) postUrl.openConnection();
        httpsURLConnection.setRequestMethod("PUT");
        segéd1();
        String params = "{\"name\":\""+name+"\", \"gender\":\""+gender+"\", \"email\":\""+email+"\", \"status\":\""+status+"\"}";
        segéd2(params);
        String response = segéd3(HttpsURLConnection.HTTP_OK);
        if(!response.equals("Hiba!!!")) {
            ta3.setText(response);
        } else {
            ta3.setText("A user módosítása sajnos nem sikerült.");
        }
    }
    @FXML
    protected void rest1MenuDeleteClick() {
        ElemekTörlése();
        clearControlUIData(tf16);
        ta4.setText("");
        gr9.setVisible(true);
        gr9.setManaged(true);
    }
    @FXML
    protected void btnRest1MenuDeleteClick() throws IOException {
        ta4.setText("");
        String ID = tf16.getText();
        String url = "https://gorest.co.in/public/v1/users"+"/"+ID;
        URL postUrl = new URL(url);
        httpsURLConnection = (HttpsURLConnection) postUrl.openConnection();
        httpsURLConnection.setRequestMethod("DELETE");
        segéd1();
        String response = segéd3(HttpsURLConnection.HTTP_NO_CONTENT);
        if(!response.equals("Hiba!!!")) {
            ta4.setText("Sikeresen törölte a user-t!");
        } else {
            ta4.setText("A user törlése sajnos nem sikerült.");
        }
    }


    @FXML
    protected void rest2MenuCreateClick() {
        ElemekTörlése();
        clearControlUIData(tf17, tf18);
        ta5.setText("");
        gr10.setVisible(true);
        gr10.setManaged(true);
    }
    @FXML
    protected void btnRest2MenuCreateClick() throws IOException {
        ta5.setText("");
        String nev = tf17.getText();
        String osztaly = tf18.getText();

    }
    @FXML
    protected void rest2MenuReadClick() {
        ElemekTörlése();
        clearControlUIData(tf19);
        ta6.setText("");
        gr11.setVisible(true);
        gr11.setManaged(true);
    }
    @FXML
    protected void btnRest2MenuReadClick() throws IOException {
        ta6.setText("");
    }

    @FXML
    protected void rest2MenuUpdateClick() {
        ElemekTörlése();
        clearControlUIData(tf20, tf21, tf22);
        ta7.setText("");
        gr12.setVisible(true);
        gr12.setManaged(true);
    }
    @FXML
    protected void btnRest2MenuUpdateClick() throws IOException {
        ta7.setText("");
        String ID = tf20.getText();
        String nev = tf21.getText();
        String osztaly = tf22.getText();

    }
    @FXML
    protected void rest2MenuDeleteClick() {
        ElemekTörlése();
        clearControlUIData(tf23);
        ta8.setText("");
        gr13.setVisible(true);
        gr13.setManaged(true);
    }
    @FXML
    protected void btnRest2MenuDeleteClick() throws IOException {
        ta8.setText("");
        String ID = tf23.getText();

            ta8.setText("A süti törlése sajnos nem sikerült.");

    }
    @FXML
    protected void soapKliensMenuLetöltés() {
        ElemekTörlése();
        gr17.setVisible(true);
        gr17.setManaged(true);
    }
    @FXML
    protected void btnsoapKliensMenuLetöltés() throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("soap.fxml"));
            Scene scene = new Scene(root, 575, 292);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }


        

    
    @FXML
    protected void soapKliensMenuLetöltés2() {


    }
    @FXML
    protected void soapKliensMenuGrafikon() {
        ElemekTörlése();
        gr18.setVisible(true);
        gr18.setManaged(true);

    }
    @FXML
    protected void btnsoapKliensMenuGrafikon() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("graf.fxml"));
        Scene scene = new Scene(root, 600, 400);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void adatbányászatMenuDöntésiFa() {
        ElemekTörlése();
        döntésiFaMsg.setText("");
        gr14.setVisible(true);
        gr14.setManaged(true);
    }
    @FXML
    protected void btnAdatbányászatMenuDöntésiFa() {
        String fájlNév = "data/vote.arff";
        int classIndex = 16;
        new GépiTanulás1(fájlNév, classIndex);
        döntésiFaMsg.setText("Elvileg sikerült a művelet!");
        setTimerForLabel(döntésiFaMsg);
    }
    @FXML
    protected void adatbányászatMenuTöbbAlgoritmus() {
        ElemekTörlése();
        gr15.setVisible(true);
        gr15.setManaged(true);
    }
    @FXML
    protected void btnAdatbányászatMenuTöbbAlgoritmus() throws Exception {
        String fájlNév = "data/vote.arff";
        int classIndex = 16;
        PrintWriter kiir = new PrintWriter("Gépi tanulás.txt");
        String bestCorrectlyCIClassName = "";
        List<String[]> list = new ArrayList<String[]>();
        String[] arr1 = new GépiTanulás2CrossValidation(fájlNév, classIndex, new J48(), kiir, "Döntési fa").getImportantData();
        String[] arr2 = new GépiTanulás2CrossValidation(fájlNév, classIndex, new SMO(), kiir, "Support-vector machine").getImportantData();
        String[] arr3 = new GépiTanulás2CrossValidation(fájlNév, classIndex, new NaiveBayes(), kiir, "NaiveBayes").getImportantData();
        IBk classifier = new IBk();
        classifier.setOptions(Utils.splitOptions("-K 10"));
        String[]arr4 = new GépiTanulás2CrossValidation(fájlNév, classIndex, classifier, kiir, "K-legközelebbi szomszéd").getImportantData();
        String[] arr5 = new GépiTanulás2CrossValidation(fájlNév, classIndex, new RandomForest(), kiir, "RandomForest").getImportantData();
        kiir.close();
        double bestCorrClassIns = 0.0;
        list.add(arr1);
        list.add(arr2);
        list.add(arr3);
        list.add(arr4);
        list.add(arr5);
        for(int i = 0; i < list.size(); i++) {
            double value = Double.parseDouble(list.get(i)[0]);
            if(value > bestCorrClassIns) {
                bestCorrClassIns = value;
                bestCorrectlyCIClassName = list.get(i)[1];
            }
        }
        ta9.setText(bestCorrectlyCIClassName);
        ta9.setFont(new Font(36.0));
    }
    @FXML
    protected void adatbányászatMenuTöbbAlgoritmus2() {
        ElemekTörlése();
        gr16.setVisible(true);
        gr16.setManaged(true);
        ta10.setText("");
    }
    @FXML
    protected void btnAdatbányászatMenuTöbbAlgoritmus2() throws Exception {
        String fájlNév = "data/vote.arff";
        int classIndex = 16;
        ta10.setText("");
        List<String> data = new ArrayList<String>();
        String algoritmus = cb5.getValue() + "";
        switch(algoritmus) {
            case "Döntési fa":
                data = new GépiTanulás3CrossValidation(fájlNév, classIndex, new J48()).getData();
                break;
            case "Support-vector machine":
                data = new GépiTanulás3CrossValidation(fájlNév, classIndex, new SMO()).getData();
                break;
            case "NaiveBayes":
                data = new GépiTanulás3CrossValidation(fájlNév, classIndex, new NaiveBayes()).getData();
                break;
            case "K-legközelebbi szomszéd":
                IBk classifier = new IBk();
                classifier.setOptions(Utils.splitOptions("-K 10"));
                data = new GépiTanulás3CrossValidation(fájlNév, classIndex, classifier).getData();
                break;
            case "RandomForest":
                data = new GépiTanulás3CrossValidation(fájlNév, classIndex, new RandomForest()).getData();
                break;
        }
        setTextArea10(data);
    }
    protected void setTextArea10(List<String> data) {
        String text = "";
        for(String d : data) text += d;
        ta10.setText(text);
        ta10.setFont(new Font(25.0));
    }
    @FXML
    protected void egyébMenuPárhuzamos() {
        ElemekTörlése();
        gr5.setVisible(true);
        gr5.setManaged(true);
    }

    @FXML
    protected void btnPárhuzamosStart() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("parallel.fxml"));
        Scene scene = new Scene(root, 600, 400);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void egyébMenuStream() {

    }


    public void vissza_click(ActionEvent actionEvent) {
    }
}
