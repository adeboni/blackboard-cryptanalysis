package knowledge.sources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import blackboard.Blackboard;
import blackboard.BlackboardContext;
import domain.Assumption;
import domain.Sentence;
import domain.Word;
import util.SentenceUtil;

public class LetterFrequencyKnowledgeSource extends LetterKnowledgeSource {

    @Override
    public String toString() {
        return "LetterFrequencyKnowledgeSource";
    }

    @Override
    public void evaluate() {
    	Blackboard blackboard = BlackboardContext.getInstance().getBlackboard();
        Sentence sentence = blackboard.getSentence();
        ConcurrentLinkedQueue<Assumption> queue = this.getPastAssumptions();
        List<Word> words = SentenceUtil.getWords(sentence);
        
        
    }
    
    class Pair {
  	  public Character c;
  	  public Double percent;
  	  public Pair(char ch, double db) {
  		  c = new Character(Character.toUpperCase(ch));
  		  percent = new Double(db);
  	  }
  	}

  	class SortByPercent implements Comparator<Pair> {
  		public int compare(Pair p1, Pair p2) {
  			return Double.compare(p1.percent, p2.percent);
  		}
  	}

  	public LetterFrequencyKnowledgeSource() {
  		initCharFrequencyList();
  		initFirstCharFrequencyList();
  		initLastCharFrequencyList();
  	}
  	
  	void initCharFrequencyList() {
  		charFrequencyList.add(new Pair('E', 12.49)); 
  		charFrequencyList.add(new Pair('T', 9.28));  
  		charFrequencyList.add(new Pair('A', 8.04));  
  		charFrequencyList.add(new Pair('O', 7.64));  
  		charFrequencyList.add(new Pair('I', 7.57));  
  		charFrequencyList.add(new Pair('N', 7.23));  
  		charFrequencyList.add(new Pair('S', 6.51));  
  		charFrequencyList.add(new Pair('R', 6.28));  
  		charFrequencyList.add(new Pair('H', 5.05));  
  		charFrequencyList.add(new Pair('L', 4.07));  
  		charFrequencyList.add(new Pair('D', 3.82));  
  		charFrequencyList.add(new Pair('C', 3.34));  
  		charFrequencyList.add(new Pair('U', 2.73));  
  		charFrequencyList.add(new Pair('M', 2.51));  
  		charFrequencyList.add(new Pair('F', 2.40));  
  		charFrequencyList.add(new Pair('P', 2.14));  
  		charFrequencyList.add(new Pair('G', 1.87));  
  		charFrequencyList.add(new Pair('W', 1.68));  
  		charFrequencyList.add(new Pair('Y', 1.66));  
  		charFrequencyList.add(new Pair('B', 1.48));  
  		charFrequencyList.add(new Pair('V', 1.05));  
  		charFrequencyList.add(new Pair('K', 0.54));  
  		charFrequencyList.add(new Pair('X', 0.23));  
  		charFrequencyList.add(new Pair('J', 0.16));  
  		charFrequencyList.add(new Pair('Q', 0.12));  
  		charFrequencyList.add(new Pair('Z', 0.09));  
  	}
  	
  	void initFirstCharFrequencyList() {
  		firstCharFrequencyList.add(new Pair('e', 2.799));
  		firstCharFrequencyList.add(new Pair('t', 15.978));
  		firstCharFrequencyList.add(new Pair('a', 11.682));
  		firstCharFrequencyList.add(new Pair('o', 7.631));
  		firstCharFrequencyList.add(new Pair('n', 2.284));
  		firstCharFrequencyList.add(new Pair('s', 6.686));
  		firstCharFrequencyList.add(new Pair('r', 2.826));
  		firstCharFrequencyList.add(new Pair('h', 4.200));
  		firstCharFrequencyList.add(new Pair('l', 2.415));
  		firstCharFrequencyList.add(new Pair('d', 3.174));
  		firstCharFrequencyList.add(new Pair('c', 5.238));
  		firstCharFrequencyList.add(new Pair('u', 1.183));
  		firstCharFrequencyList.add(new Pair('m', 3.826));
  		firstCharFrequencyList.add(new Pair('f', 4.027));
  		firstCharFrequencyList.add(new Pair('p', 4.319));
  		firstCharFrequencyList.add(new Pair('g', 1.642));
  		firstCharFrequencyList.add(new Pair('w', 5.497));
  		firstCharFrequencyList.add(new Pair('y', 0.763));
  		firstCharFrequencyList.add(new Pair('b', 4.434));
  		firstCharFrequencyList.add(new Pair('v', 0.824));
  		firstCharFrequencyList.add(new Pair('k', 0.456));
  		firstCharFrequencyList.add(new Pair('x', 0.045));
  		firstCharFrequencyList.add(new Pair('j', 0.511));
  		firstCharFrequencyList.add(new Pair('q', 0.222));
  		firstCharFrequencyList.add(new Pair('z', 0.045));
  		Collections.sort(firstCharFrequencyList, new SortByPercent());
  	}
  	
  	void initLastCharFrequencyList() {
  		lastCharFrequencyList.add(new Pair('e', 20.134));
  		lastCharFrequencyList.add(new Pair('t', 8.971));
  		lastCharFrequencyList.add(new Pair('a', 2.819));
  		lastCharFrequencyList.add(new Pair('o', 4.177));
  		lastCharFrequencyList.add(new Pair('i', 0.752));
  		lastCharFrequencyList.add(new Pair('n', 9.310));
  		lastCharFrequencyList.add(new Pair('s', 12.903));
  		lastCharFrequencyList.add(new Pair('r', 5.899));
  		lastCharFrequencyList.add(new Pair('h', 2.712));
  		lastCharFrequencyList.add(new Pair('l', 3.465));
  		lastCharFrequencyList.add(new Pair('d', 9.981));
  		lastCharFrequencyList.add(new Pair('c', 0.603));
  		lastCharFrequencyList.add(new Pair('u', 0.389));
  		lastCharFrequencyList.add(new Pair('m', 1.656));
  		lastCharFrequencyList.add(new Pair('f', 4.714));
  		lastCharFrequencyList.add(new Pair('p', 0.541));
  		lastCharFrequencyList.add(new Pair('g', 2.939));
  		lastCharFrequencyList.add(new Pair('w', 0.821));
  		lastCharFrequencyList.add(new Pair('y', 6.002));
  		lastCharFrequencyList.add(new Pair('b', 0.123));
  		lastCharFrequencyList.add(new Pair('v', 0.055));
  		lastCharFrequencyList.add(new Pair('k', 0.802));
  		lastCharFrequencyList.add(new Pair('x', 0.165));
  		lastCharFrequencyList.add(new Pair('j', 0.022));
  		lastCharFrequencyList.add(new Pair('q', 0.013));
  		lastCharFrequencyList.add(new Pair('z', 0.033));
  		Collections.sort(lastCharFrequencyList, new SortByPercent());
  	}
  	
  	List<Pair> charFrequencyList = new ArrayList<Pair>();
  	List<Pair> firstCharFrequencyList = new ArrayList<Pair>();
  	List<Pair> lastCharFrequencyList = new ArrayList<Pair>();

}
