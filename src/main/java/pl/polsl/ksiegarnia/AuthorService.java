package pl.polsl.ksiegarnia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@ComponentScan
public class AuthorService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Author> findAll() {
        return jdbcTemplate.query(
                "SELECT id, first_name, last_name FROM customers",
                (rs, rowNum) -> new Author(rs.getLong("id"),
                        rs.getString("first_name"), rs.getString("last_name")));
    }

    public void update(Author author) {
        jdbcTemplate.update(
                "UPDATE customers SET first_name=?, last_name=? WHERE id=?",
                author.getFirstName(), author.getLastName(), author.getId());
    }
}
