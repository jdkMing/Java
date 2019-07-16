import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

import com.bawei.common.utils.DateUtil;
import com.bawei.common.utils.StringUtil;

public class DateUtilTest {
	
	@Test
	public void ageFromTodayTest() {
		assertEquals(19, DateUtil.ageFromToday(new GregorianCalendar(2000, 5, 6)));
		assertNotEquals(18, DateUtil.ageFromToday(new GregorianCalendar(2000, 5, 6)));
	}
}
