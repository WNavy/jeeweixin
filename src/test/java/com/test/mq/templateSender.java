/**
 * 
 */
package com.test.mq;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author zhangsw
 *
 */
public class templateSender {
	public static void main(String[] args)throws ParseException  {
		/*ApplicationContext ctx = new FileSystemXmlApplicationContext(
				"classpath:activeMqContext.xml");
		JmsTemplate jmsTemplate = (JmsTemplate) ctx.getBean("jmsTemplate");
		jmsTemplate.send(new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				TextMessage message = session.createTextMessage();
				SimpleDateFormat formatter = new SimpleDateFormat(
						"yyyy-MM-dd HH:mm:ss");
				String date = formatter.format(new Date());
				String text = "current system time: " + date;
				message.setText(text);
				System.out.println(text);
				return message;
			}
		});*/
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Date time=formatter.parse("2016-11-01");
//		Date date=new Date();//取时间
//		 Calendar calendar = new GregorianCalendar();
//		 //calendar.setTime(time);
//		 calendar.setFirstDayOfWeek(Calendar.MONDAY);
//		 
//		 int dayweek= calendar.get(Calendar.DAY_OF_WEEK);
//		calendar.add(Calendar.DATE, calendar.getFirstDayOfWeek()-dayweek);//根据日历的规则，给当前日期减去星期几与一个星期第一天
//		date=calendar.getTime();
//		
//		String dateString = formatter.format(date);
//		
//		System.out.println(dateString);
//		
//		Calendar cal =Calendar.getInstance();
//		//cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
//		Date time1 = cal.getTime();
//		
//		System.out.println(formatter.format(date));
//		System.out.println(formatter.format(time1));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//		if(cal.get(Calendar.DAY_OF_WEEK)==Calendar.MONDAY){
//			
//		}
		
		Calendar cale = Calendar.getInstance();   
        cale.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天 
       String lastDay = formatter.format(cale.getTime());
        System.out.println("-----2------lastDay:"+lastDay);
        
        
        Calendar ca = Calendar.getInstance();    
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));  
        String last = formatter.format(ca.getTime());
        System.out.println("===============last:"+last);
		SimpleDateFormat ftTime = new SimpleDateFormat("HH:mm:ss");
		String date=formatter.format(new Date()).substring(0, 10);
        System.out.println(formatter.parse(date+" "+ftTime.format(new Date())));
	}
}
