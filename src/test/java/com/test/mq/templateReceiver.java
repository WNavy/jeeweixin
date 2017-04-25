/**
 * 
 */
package com.test.mq;

import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

/**
 * @author zhangsw
 *
 */
public class templateReceiver {
	public static void main(String[] args) throws JMSException {
		ApplicationContext ctx = new FileSystemXmlApplicationContext(
				"classpath:activeMqContext.xml");
		JmsTemplate jmsTemplate = (JmsTemplate) ctx.getBean("jmsTemplate");
		while (true) {
			// 设置10s超时时间
			jmsTemplate.setReceiveTimeout(1000 * 10);
			TextMessage text = (TextMessage) jmsTemplate.receive();
			if (text == null)
				break;
			// 接收到相应的消息
			System.out.println("收到消息：" + text.getText());
		}
	}
}
