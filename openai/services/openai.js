const { Configuration, OpenAIApi } = require('openai');
OPENAI_API_KEY = "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"
const configuration = new Configuration({
  apiKey: OPENAI_API_KEY,
});

const openAI = new OpenAIApi(configuration);

async function openAiMessage(prompt) {
  try {
    const { data } = await openAI.createCompletion({
      model: 'text-davinci-003',
      prompt,
      max_tokens: 100,
    });
    const [choices] = data.choices;

    return choices.text.trim(); // OpenAI 回傳時都會有許多空白，因此要使用 trim 去除前後空白
  } catch (error) {
    // eslint-disable-next-line no-console
    console.error(error);
    return `對不起，我發生 **${error.response.status} - ${error.response.statusText}** 錯誤，所以不知道該怎麼回你 QQ`;
  }
}

module.exports = {
  openAiMessage,
};
