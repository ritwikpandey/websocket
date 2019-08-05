package per.ritwik.websocket.controller;

import java.io.IOException;

import org.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class SocketTextHandler extends TextWebSocketHandler {

	@Override
	public void handleTextMessage(WebSocketSession session, TextMessage message)
			throws InterruptedException, IOException {

		String sid = session.getId();
		String payload = message.getPayload();
		JSONObject jsonObject = new JSONObject(payload);
		String msg = jsonObject.getString("user");
		String response = getResponseFromAgent(msg, sid);
		session.sendMessage(new TextMessage(response));
	}

	private String getResponseFromAgent(String msg, String sid) {
		String agentQueueName = chooseAgent(sid);
		return "Response from Agent " + agentQueueName;
	}
	
	
	private String chooseAgent(String sessionId) {
		int intSessionId = Integer.parseInt(sessionId);
		String agentQueue = String.valueOf(intSessionId%3);
		return agentQueue;
	}
}