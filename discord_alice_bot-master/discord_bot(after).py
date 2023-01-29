import os
import discord
import aiml
from discord.ext import commands

class DiscordBot:
    def __init__(self, token_file):
        self.bot = commands.Bot(command_prefix='//')
        self.alice = aiml.Kernel()

        with open(token_file, "r") as file:
            self.token = file.read().strip()

        os.chdir('alice')
        self.alice.learn("startup.xml")
        self.alice.respond('LOAD ALICE')

    async def run(self):
        @self.bot.event
        async def on_ready():
         # 確認機器人上線
            print("Bot is ready.")
        
        @self.bot.event
        async def on_member_join(member):
            channel = self.bot.get_channel(698895507992346674)
                # 在頻道發送加入伺服器訊息
            await channel.send(f'{member} join ! ')

        @self.bot.event
        async def on_member_remove(member):
            channel = self.bot.get_channel(698895507992346674)
            # 在頻道發送離開伺服器訊息
            await channel.send(f'{member} leave ! ')

        @self.bot.command()
        async def ping(ctx):
            await ctx.send(f'{round(self.bot.latency * 1000)} ms')

        @self.bot.command()
        async def chat(ctx, *args):
            ret_msg = self.alice.respond(" ".join(args).lstrip())
            # 聊天功能
            await ctx.send(ret_msg)

        self.bot.run(self.token)

if __name__ == "__main__":
    bot = DiscordBot("TOKEN")
    bot.run()