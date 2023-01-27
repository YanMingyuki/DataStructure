const { Client, GatewayIntentBits } = require('discord.js');
const { openAiMessage } = require('./services/openai');

const client = new Client({ intents: [
  GatewayIntentBits.Guilds,
  GatewayIntentBits.GuildMessages,
  GatewayIntentBits.MessageContent,
]});

client.on('ready', () => {
  console.log(`Logged in as ${client.user.tag}!`);
});

client.on('messageCreate', async message => {
  console.log('使用者發送的訊息：', message.content);
  if (message.author.bot) return; // 避免機器人互相回覆
  const response = await openAiMessage(message.content);
  message.reply(response);
});
TOKEN = "MTA1NzU1NTM3MzgzNTQyNzg2MA.GerQvK.UA-yhqbXoe_WOCfQucobRQYO6D6uziz_UtHe4w"
client.login(TOKEN);
