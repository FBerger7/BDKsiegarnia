package pl.polsl.ksiegarnia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

public class AuthorService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Author> findAll() {
        return jdbcTemplate.query(
                "SELECT id, first_name, last_name FROM customers",
                (rs, rowNum) -> new Author(rs.getLong("id"),
                        rs.getString("first_name"), rs.getString("last_name")));
    }

    public void update(Author customer) {
        jdbcTemplate.update(
                "UPDATE customers SET first_name=?, last_name=? WHERE id=?",
                customer.getFirstName(), customer.getLastName(), customer.getId());
    }
}
