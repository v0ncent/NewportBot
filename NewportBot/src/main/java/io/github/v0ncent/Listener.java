package io.github.v0ncent;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Listener extends ListenerAdapter {
    private static final Logger LOGGER = LoggerFactory.getLogger(Listener.class);

    @Override
    public void onReady(@NotNull ReadyEvent event) {
        // register commands



        LOGGER.info(" a,  8a\n" +
                " `8, `8)                            ,adPPRg,\n" +
                "  8)  ]8                        ,ad888888888b\n" +
                " ,8' ,8'                    ,gPPR888888888888\n" +
                ",8' ,8'                 ,ad8\"\"   `Y888888888P\n" +
                "8)  8)              ,ad8\"\"        (8888888\"\"\n" +
                "8,  8,          ,ad8\"\"            d888\"\"\n" +
                "`8, `8,     ,ad8\"\"            ,ad8\"\"\n" +
                " `8, `\" ,ad8\"\"            ,ad8\"\"\n" +
                "    ,gPPR8b           ,ad8\"\"\n" +
                "   dP:::::Yb      ,ad8\"\"\n" +
                "   8):::::(8  ,ad8\"\"\n" +
                "   Yb:;;;:d888\"\"  Newport\n" +
                "    \"8ggg8P\"      Bot");
    }

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {

    }

}