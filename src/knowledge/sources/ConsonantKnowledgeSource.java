package knowledge.sources;

import java.util.HashSet;
import java.util.Set;

public class ConsonantKnowledgeSource extends LetterKnowledgeSource {

    @Override
    public String toString() {
        return "ConsonantKnowledgeSource";
    }

    @Override
    public void evaluate() {
        // TODO Auto-generated method stub
    }
    
    public ConsonantKnowledgeSource() {
		char consonantarray[] = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p',
			'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z',};
		for (int i = 0; i < consonantarray.length; ++i) {
		  consonants.add(new Character(consonantarray[i]));
		  consonants.add(Character.toUpperCase(consonantarray[i]));
		}
	}
	
	boolean isConsonant(char c) {
		return consonants.contains(new Character(c));
	}
	
	Set<Character> consonants = new HashSet<Character>();

}