package ru.job4j.max;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Evgeniy Shegay (terrasan30@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class MaxTest {
	/**
     * Test echo.
     */ @Test
	public void maxValue() {
		 Max maxim = new Max();
		 int result = maxim.max(2, 3, 4);
		 assertThat(result, is(4));
	}  
}