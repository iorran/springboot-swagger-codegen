package br.com.iorran.item;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	@ApiModelProperty(notes = "The database generated item ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

    @ApiModelProperty(notes = "The item name")
	@Column 
	private String name;
}
