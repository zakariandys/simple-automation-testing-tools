package com.automation.database;

import com.automation.app.domain.Transaction;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class TransactionDatabase {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/bukalapak_transaction?rewriteBatchedStatements=true&useSSL=false&serverTimezone=UTC";
    private Connection connection;
    private PreparedStatement preparedStatement;

    public List<Transaction> selectTransactionData(String startDate, String endDate) {
        List<Transaction> listOfTransactions = new ArrayList<Transaction>();
        String query = "SELECT * FROM transaction " +
                "WHERE date_order " +
                "BETWEEN STR_TO_DATE(?, '%d/%m/%Y') AND STR_TO_DATE(?, '%d/%m/%Y');";
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, startDate);
            preparedStatement.setString(2, endDate);
            ResultSet result = preparedStatement.executeQuery();

            while (result.next()) {
                Transaction transaction = composeObject(result);
                listOfTransactions.add(transaction);
            }
            return listOfTransactions;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return listOfTransactions;
    }

    private Connection getConnection() throws ClassNotFoundException, SQLException, IllegalAccessException, InstantiationException {
        Properties props = new Properties();
        Class.forName("com.mysql.jdbc.Driver");
        props.setProperty("user", "zakariandys");
        props.setProperty("password", "");
        return DriverManager.getConnection(DB_URL, props);
    }

    private Transaction composeObject(ResultSet result) throws SQLException {
        Transaction t = new Transaction();
        t.setTransactionId(result.getString("TRX_ID"));
        t.setAddressShip(result.getString("ADDRESS_SHIP"));
        t.setDateOrder(result.getString("DATE_ORDER"));
        t.setSellerName(result.getString("SELLER_NAME"));
        t.setDeliveryService(result.getString("DELIVERY_SERVICE"));
        return t;
    }
}
