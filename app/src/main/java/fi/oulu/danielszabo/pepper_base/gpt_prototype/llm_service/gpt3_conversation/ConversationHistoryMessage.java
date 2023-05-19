package fi.oulu.danielszabo.pepper_base.gpt_prototype.llm_service.gpt3_conversation;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ConversationHistoryMessage {

  private String source, content;
  private long timestamp;

}
