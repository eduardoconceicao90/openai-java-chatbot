package br.com.alura.ecomart.chatbot.infra.openai;

import com.knuddels.jtokkit.Encodings;
import com.knuddels.jtokkit.api.Encoding;
import com.knuddels.jtokkit.api.ModelType;
import org.springframework.stereotype.Component;

@Component
public class ContadorDeTokens {

    private final Encoding encoding;

    public ContadorDeTokens() {
        var registry = Encodings.newDefaultEncodingRegistry();
        this.encoding = registry.getEncodingForModel(ModelType.GPT_3_5_TURBO_16K);
    }

    public int contarTokens(String mensagem) {
        return encoding.countTokens(mensagem);
    }

}
