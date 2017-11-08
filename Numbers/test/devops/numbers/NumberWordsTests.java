package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	
   
	@Test
	public void numberOneReturnsOne() {
		Assert.assertEquals( "One", "1", numberWords.toWords( 1 ) ) ;
	}
	
	@Test
	public void numberTwoReturnsTwo() {
		Assert.assertEquals( "Two", "2", numberWords.toWords( 2 ) ) ;
	}
	
	@Test
	public void numberThreeReturnsThree() {
		Assert.assertEquals( "Three", "3", numberWords.toWords( 3 ) ) ;
	}
	@Test
	public void numberFourReturnsFour() {
		Assert.assertEquals( "Four", "4", numberWords.toWords( 4 ) ) ;
	}
	
	@Test
	public void numberFiveReturnsFive() {
		Assert.assertEquals( "Five", "5", numberWords.toWords( 5 ) ) ;
	}
	
	@Test
	public void numberSixReturnsSix() {
		Assert.assertEquals( "Six", "6", numberWords.toWords( 6 ) ) ;
	}
	
	@Test
	public void numberSevenReturnsSeven() {
		Assert.assertEquals( "Seven", "7", numberWords.toWords( 7 ) ) ;
	}
	
}
