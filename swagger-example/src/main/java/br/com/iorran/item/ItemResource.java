package br.com.iorran.item;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="items")
@RestController
@RequestMapping("items")
public class ItemResource {
	@Autowired
	private ItemRepository itemRepository;
	
	@ApiOperation(value = "Find a item by id", nickname = "findOneItem")
	@GetMapping("{id}")
	public ResponseEntity<Item> findOneItem(@PathVariable Long id) {
		Optional<Item> item = itemRepository.findById(id);
		return item.map(response -> ResponseEntity.ok()
				.body(response))
				.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

}
