package io.github.v0ncent;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class CommandManager {
    private final ArrayList<CommandData> commands;

    public CommandManager() {
         commands = new ArrayList<>();
    }

    public ArrayList<CommandData> getCommands() {
        return this.commands;
    }

    public void BotherTrent(Guild guild) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        Runnable task = () -> {
            Objects.requireNonNull(
                    guild.getTextChannelById("1261863360547524710"))
                    .sendMessage(
                            Objects.requireNonNull(guild.getMemberById(Config.get("TRENT")))
                                    .getAsMention() + "https://tenor.com/view/trent-are-you-feeling-it-sans-undertale-gif-26806710")
                    .queue();
        };

        // Calculate the initial delay to midnight
        long initialDelay = getInitialDelayToMidnight();

        // Schedule the task to run daily
        scheduledExecutorService.scheduleAtFixedRate(task, initialDelay, 24, TimeUnit.HOURS);
    }

    private long getInitialDelayToMidnight() {
        LocalTime now = LocalTime.now();
        LocalTime midnight = LocalTime.of(1,19);
        long delay = now.until(midnight, ChronoUnit.SECONDS);

        if (delay < 0) {
            // If it's already past midnight, schedule for the next day
            delay += TimeUnit.DAYS.toSeconds(1);
        }

        return delay;
    }

}
