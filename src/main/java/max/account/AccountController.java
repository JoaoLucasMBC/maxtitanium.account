package max.account;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface AccountController {
    
    @GetMapping("/accounts/{id}")
    public ResponseEntity<AccountOut> read(@PathVariable(required = true) String id);

    @PostMapping("/accounts")
    public ResponseEntity<AccountOut> create(@RequestBody(required = true) AccountIn accountIn);

    @PutMapping("/accounts/{id}")
    public ResponseEntity<AccountOut> update(@PathVariable(required = true) String id, @RequestBody(required = true) AccountIn accountIn);

    @GetMapping("/accounts/{id}")
    public ResponseEntity<AccountOut> delete(@PathVariable(required = true) String id);
}
