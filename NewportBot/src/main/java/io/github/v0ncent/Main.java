package io.github.v0ncent;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.ChunkingFilter;
import net.dv8tion.jda.api.utils.MemberCachePolicy;
import net.dv8tion.jda.api.utils.cache.CacheFlag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final JDABuilder BOT = JDABuilder.createDefault(Config.get("TOKEN"));
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        BOT.setChunkingFilter(ChunkingFilter.ALL);
        BOT.setMemberCachePolicy(MemberCachePolicy.ALL);
        BOT.enableIntents(GatewayIntent.GUILD_MEMBERS);
        BOT.enableCache(CacheFlag.VOICE_STATE);
        BOT.enableIntents(GatewayIntent.GUILD_MESSAGES);
        BOT.enableIntents(GatewayIntent.GUILD_VOICE_STATES);
        BOT.enableIntents(GatewayIntent.DIRECT_MESSAGE_REACTIONS);
        BOT.enableIntents(GatewayIntent.DIRECT_MESSAGES);
        BOT.enableIntents(GatewayIntent.GUILD_EMOJIS_AND_STICKERS);
        BOT.enableIntents(GatewayIntent.GUILD_MESSAGE_TYPING);
        BOT.enableIntents(GatewayIntent.GUILD_PRESENCES);
        BOT.enableIntents(GatewayIntent.GUILD_INVITES);
        BOT.enableIntents(GatewayIntent.MESSAGE_CONTENT);
        BOT.enableIntents(GatewayIntent.GUILD_MODERATION);
        BOT.enableIntents(GatewayIntent.SCHEDULED_EVENTS);

        BOT.setActivity(Activity.playing("Cheefin"));

        BOT.build();

        LOGGER.info("Bot online and running!");
    }
}