package firstProject;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Project implements Serializable {

	private static final long serialVersionUID = 8992838291971246021L;
	
	private String number;
	private String name;
	@Override
	public String toString() {
		return name + " : " + number;
	}

}
