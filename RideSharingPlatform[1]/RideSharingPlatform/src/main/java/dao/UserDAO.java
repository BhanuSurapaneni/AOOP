package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	 private String jdbcURL = "jdbc:postgresql://localhost:5432/ride_sharing";
	    private String jdbcUsername = "postgres";
	    private String jdbcPassword = "your_password";

	    protected Connection getConnection() {
	        Connection connection = null;
	        try {
	            Class.forName("org.postgresql.Driver");
	            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return connection;
	    }

	    public void registerUser(String username, String password, String userType) {
	        String sql = "INSERT INTO users (username, password, user_type) VALUES (?, ?, ?)";
	        try (Connection connection = getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
	            preparedStatement.setString(1, username);
	            preparedStatement.setString(2, password);
	            preparedStatement.setString(3, userType);
	            preparedStatement.executeUpdate();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public List<String> getAllUsers() {
	        List<String> users = new ArrayList<>();
	        String sql = "SELECT * FROM users";
	        try (Connection connection = getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(sql);
	             ResultSet resultSet = preparedStatement.executeQuery()) {
	            while (resultSet.next()) {
	                users.add(resultSet.getString("username"));
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return users;
	    }
}
