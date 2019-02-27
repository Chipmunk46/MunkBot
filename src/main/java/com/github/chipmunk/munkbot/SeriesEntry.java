package com.github.chipmunk.munkbot;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

import org.javacord.api.entity.channel.TextChannel;
import org.javacord.api.entity.message.embed.EmbedBuilder;

class SeriesEntry {
    public String mSeries;
    public EmbedBuilder mEmbed;

    public SeriesEntry(String series, EmbedBuilder embed) {
        mSeries = series;
        mEmbed = embed;
    }
}

class MapEntry {
	public String mSeries;
	public String mName;
	public EmbedBuilder mEmbed;
	
	public MapEntry(String series, String name, EmbedBuilder embed) {
		//If 3 arguments are used
		mSeries = series;
		mName = name;
		mEmbed = embed;
	}
}


class MapList {

    List<SeriesEntry> seriesList = Arrays.asList(
    	//Ragecraft
    	new SeriesEntry("rc", new EmbedBuilder()
            .setTitle("Series Description")
            .setDescription("Ragecraft is a series of brutally difficulty, amazingly beautiful, and impeccably balanced CTM maps. "
            		+ "If you're looking for a long term challenge that will take your skills to the next level, this is the series for you.")
            .setAuthor("Ragecraft by Heliceo","http://www.minecraftforum.net/forums/mapping-and-modding/maps/1537478-ctm-ragecraft-series-by-heliceo","")
            // List of Maps
            .addInlineField("The Corrupted Path", "Version: 1.5.2")
            .addInlineField("Insomnia", "Version: 1.7.2")
            .addInlineField("The Prophecy", "Version: 1.8.8")
            //Footer
            .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
            // Embed Color
            .setColor(Color.RED)
            // Map Image
            .setImage("http://i.imgur.com/iAG6vh7.jpg")
            // CTMC Logo
            .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // Chimarian Memories
        new SeriesEntry("cm", new EmbedBuilder()
            .setTitle("Series Description")
            .setDescription("Chimarian Memories is a map series dedicated to providing a difficult "
            		+ "challenge to player while showcasing a large amount of unique mechanics "
            		+ "and loot for the player to experiment with in any kind of playstyle.")
            .setAuthor("Chimarian Memories by Chipmunk46","https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/maps/1554519-ctm-chimarian-memories-ctm-series-new-minimap","")
            // List of Maps
            .addInlineField("Into the Storm", "Version: 1.7.4")
            .addInlineField("Hikaro Jungle", "Version: 1.7.4")
            .addInlineField("Archangel Rising", "Version: 1.8.8")
            .addInlineField("Blood of the Oracle", "Version: 1.8.8")
            // Footer
            .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
            // Embed Color
            .setColor(Color.GREEN)
            // Map Image
            .setImage("http://i.imgur.com/heyENlq.png")
            // CTMC Logo
            .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // Untold Stories
        new SeriesEntry("us", new EmbedBuilder()
                .setTitle("Series Description")
                .setDescription("Untold Stories is a Complete the Monument series where the goal is to finish the Monument by placing a rainbow of coloured wool "
                		+ "on the monument. These maps focus on Minecraft's survival mechanics while adding to it with custom command contraptions such as a custom health/food "
                		+ "system and edited natural spawns. expect to find tons of traps, secrets and puzzles scattered throughout epic, but difficult to traverse environments.")
                .setAuthor("Untold Stories by RenderXR","http://www.minecraftforum.net/forums/mapping-and-modding/maps/2295375-ctm-collection-renderxrs-untold-stories-series","")
                // List of Maps
                .addInlineField("Goliath", "Version: 1.8.x")
                .addInlineField("Bigleaf Forest", "Version: 1.8.x")
                .addInlineField("Myriad Caves", "Version: 1.9.x")
                .addInlineField("Corona Trials", "Version: 1.12.x")
                .addInlineField("Calamity Canyon", "Version: 1.12.x")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.BLUE)
                // Map Image
                .setImage("http://i.imgur.com/jo1Uehs.png")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // Super Hostile
        new SeriesEntry("sh", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("One of the pioneering series in the CTM Genre, Super Hostile is a great place to look for CTM classics.")
                .setAuthor("Super Hostile by Vechs","http://superhostile.mindcracklp.com/","")
                // List of Maps
                .addInlineField("Sea of Flame II", "Version: 1.4.7")
                .addInlineField("Infernal Sky II", "Version: 1.4.7")
                .addInlineField("The Kaizo Caverns", "Version: 1.4.7")
                .addInlineField("Legendary", "Version: 1.4.7")
                .addInlineField("Nightmare Realm", "Version: 1.4.7")
                .addInlineField("Sunburn Islands", "Version: 1.4.7")
                .addInlineField("Spellbound Caves", "Version: 1.2.5")
                .addInlineField("Lethamyr", "Version: 1.4.7")
                .addInlineField("Inferno Mines", "Version: 1.5.2")
                .addInlineField("Waking Up", "Version: 1.4.7")
                .addInlineField("Old Stuff Pack", "Version: Pre-1.4.7")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.CYAN)
                // Map Image
                .setImage("http://superhostile.mindcracklp.com/img/thumb-10.jpg")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // Smitje's CTMs
        new SeriesEntry("smitje", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("This is a great CTM series focused on pushing the bounds of minecraft mechanics! Be sure to check it out!")
                .setAuthor("Smitje's CTMs by Smitje","http://www.minecraftforum.net/forums/mapping-and-modding/maps/1537478-ctm-ragecraft-series-by-heliceo","")
                // List of Maps
                .addInlineField("Corrupted Isles", "Version: 1.12.2")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.PINK)
                // Map Image
                .setImage("https://i.imgur.com/DTnv8hLr.png")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // Omega's Odysseys
        new SeriesEntry("omega", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("Odysseys are adventures - adventures that need to be beaten. These trips will take you through several environments, all to find the elder Cores to place them in the Monument. Will you, humble player, live up to the task?")
                .setAuthor("Omega's Odysseys by Omegaplayer","http://www.minecraftforum.net/forums/mapping-and-modding-java-edition/maps/2544462-collection-omegas-odyssey-maps-bonechill-spiral","")
                // List of Maps
                .addInlineField("Bonechill Spiral", "Version: 1.12.x")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.BLUE)
                // Map Image
                .setImage("https://i.imgur.com/93jMFkT.jpg")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        //Fogotten Minis
        new SeriesEntry("fm", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("MISSING DESCRIPTION FOR SERIES TELL SCEPTICISM TO SEND DESCRIPTION TO CHIPMUNK")
                .setAuthor("Forgotten Minis by Scepticism","http://www.minecraftforum.net/forums/mapping-and-modding-java-edition/maps/2886730-realms-of-the-forgotten-souls-a-new-ctm-map-series","")
                // List of Maps
                .addInlineField("Hellfire Quarry", "Version: 1.12.x")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.MAGENTA)
                // Map Image
                .setImage("https://cdn.discordapp.com/attachments/367801302350036994/407927948415598593/2017-12-19_09.51.39.png")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // Yknottalk CTM ERROR
        new SeriesEntry("yknot", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("http://www.minecraftforum.net/forums/mapping-and-modding-java-edition/maps/2854006-yknottalks-ctm-saga-1-12-compatible-ctm-maps")
                .setAuthor("Yknottalk's CTM Saga by Yknottalk","LINK TO MAP PAGE","")
                // List of Maps
                .addInlineField("Deterministic Dreams", "Version: 1.12.2")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.BLACK)
                // Map Image
                .setImage("https://cdn.discordapp.com/attachments/367801302350036994/407927948415598593/2017-12-19_09.51.39.png")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // Cold Fusion's Maps
        new SeriesEntry("cfg", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("MISSING DESCRIPTION FOR SERIES TELL COLD FUSION TO SEND DESCRIPTION TO CHIPMUNK")
                .setAuthor("Cold Fusion's Maps by ColdFusionGaming","https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/maps/1533305-monstrosity","")
                // List of Maps
                .addInlineField("Monstrosity", "Version: 1.8.1")
                .addInlineField("Frostburn", "Version: 1.8.8")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.WHITE)
                // Map Image
                .setImage("https://i.imgur.com/0oa4JF8.jpg")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // The Legacy
        new SeriesEntry("legacy", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("The Legacy is a Complete the Monument series where the goal is to, well, complete a Monument of a variety of objectives "
                		+ "(namely wool, but can also be other items occasionally) The maps focus on unique combat environments, while also retaining survival "
                		+ "challenge and resource scarcity. The maps also feature unique mechanics and custom items to better solidify the gameplay, (such as Metroidvania "
                		+ "elements, unique charm items, and more) The maps overall feature interesting environments meshed with combat and neat mechanics.")
                .setAuthor("The Legacy by PearUhDox","https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/maps/2848255-ctm-collection-the-legacy-a-ctm-series-by","")
                // List of Maps
                .addInlineField("A Nightmare to Remember", "Version: 1.12.2")
                .addInlineField("Citadel Raiders", "Version: 1.12.2")
                .addInlineField("Instability", "Version: 1.12.2")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.RED)
                // Map Image
                .setImage("https://i.imgur.com/uuHPC5N.png")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // Vault of Adventure
        new SeriesEntry("voa", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("THIS SERIES IS MISSING A DESCRIPTION TO ADD ONE PM CHIPMUNK A DESCRIPTION ALONG WITH THE NAME OF THE MAP")
                .setAuthor("Vault of Adventure by Draco_Rogue","https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/maps/1515785-legend-of-argon-by-draco-rogue","")
                // List of Maps
                .addInlineField("Legends of Argon", "Version: 1.8.x")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.WHITE)
                // Map Image
                .setImage("https://i.imgur.com/dfTxPbr.png")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // Ty's CTM Collection
        new SeriesEntry("ty", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("THERE IS NO DESCRIPTION FOR THIS MAP TELL TY TO GIVE CHIPMUNK A DESCRIPTION FOR HIS SERIES")
                .setAuthor("Ty's CTM Collection by Ty","https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/maps/2773295-tys-ctm-map-collection","")
                // List of Maps
                .addInlineField("The Undead's Return", "Version: 1.12.x")
                .addInlineField("Trust Fall", "Version: 1.10.x")
                .addInlineField("Prison Break", "Version: 1.8.x")
                .addInlineField("A Snowy Nightmare", "Version: 1.8.x")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.ORANGE)
                // Map Image
                .setImage("https://i.imgur.com/3GqY8Oz.png")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // Extreme Adventures
        new SeriesEntry("ea", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("There are 7 maps in the Extreme Adventures CTM Series, by Krose. Each map is highly detailed and fun for veterans of the genre, "
                		+ "as well as for newcomers. The earlier stages of the maps are easier than the later dungeons. Intersections are used to structure the maps "
                		+ "to prevent players from getting lost.")
                .setAuthor("Extreme Adventures by Krose","https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/maps/1511911-ctm-collection-kroses-extreme-adventures-series-1","")
                // List of Maps
                .addInlineField("Savage Realm", "Version: 1.8.9")
                .addInlineField("Marooned", "Version: 1.8.9")
                .addInlineField("Soul Reaper", "Version: 1.8.9")
                .addInlineField("Supposed Golden Path", "Version: 1.9")
                .addInlineField("Descent Into Darkness", "Version: 1.4.7")
                .addInlineField("Skyward Ascent", "Version: 1.5.2")
                .addInlineField("Wild Charge", "Version: 1.6.4")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.CYAN)
                // Map Image
                .setImage("http://i.imgur.com/EMsYO2j.jpg")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // Sybillian's CTMs
        new SeriesEntry("syb", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("Sybillian's collection of CTM maps - consisting primarily of Jam submissions - "
                		+ "is a series of relatively easy minimaps that aim to be nontraditional in one way or another. "
                		+ "Frequently this takes the form of non-fleecy objectives or command-powered science; either way, "
                		+ "you can be sure that each entry will be absolutely unique.")
                .setAuthor("Sybillian's CTMs by Sybillian","http://www.mediafire.com/file/b3ra4d6o6y6k6zb/The+Royal+Family+-+SJ15v1.0.zip","")
                // List of Maps
                .addInlineField("The Royal Family", "Version: 1.12.2")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.GRAY)
                // Map Image
                .setImage("http://i.imgur.com/WriYkto.png")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // Project CTM
        new SeriesEntry("pctm", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("One of the biggest CTM projects out there, this series will be a test to your skill in many unique environments.")
                .setAuthor("Project CTM by CTMC","https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/maps/1531971-ctm-projectctm-collaboration-maps-collection","")
                // List of Maps
                .addInlineField("Pantheon", "Version: 1.8.9")
                .addInlineField("Titan's Revolt", "Version: 1.8.9")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.YELLOW)
                // Map Image
                .setImage("https://i.imgur.com/zgeEvEC.png")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // Karrot
        new SeriesEntry("karrot", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("This is Karrott’s first CTM map, it involves a never before seen monument which includes 16 different farm items and a single emerald block.")
                .setAuthor("Karrot's CTMs by Karrot","https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/maps/1533546-1-6-ctm-collection-easy-karrotts-maps-to-greener","")
                // List of Maps
                .addInlineField("To Greener Pastures", "Version: 1.6.2")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.GREEN)
                // Map Image
                .setImage("https://i.imgur.com/htFO4PT.png")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // Journey of Creation
        new SeriesEntry("joc", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("NO DESCRIPTION WRITE DESCRIPTION AND PM TO CHIPMUNK")
                .setAuthor("Journey of Creation by TheSketch","https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/maps/1537164-ctm-collection-sketchs-journey-of-creation-series","")
                // List of Maps
                .addInlineField("The Painter", "Version: 1.7.10")
                .addInlineField("Filler", "Add other minimaps soon.")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.MAGENTA)
                // Map Image
                .setImage("http://i.imgur.com/jx5GSB4.png")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // Deadly Realms
        new SeriesEntry("deadlyrealms", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("Aima Caves is Vitto’s first and only full CTM map, but its a revered classic.  "
                		+ "Fighting through a vareity of unique environments, such as castles, deserts, and demonic pits, "
                		+ "the map slowly builds up in difficulty, starting quite easy but getting tough at the end.  The map "
                		+ "is also on the smaller side, which makes it a wonderful beginner’s map if you’re willing to play in a more classic version.")
                .setAuthor("Deadly Realms by Vitto","https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/maps/1533347-ctm-collection-1-7-deadly-realms-series-by-vitto","")
                // List of Maps
                .addInlineField("Aima Caves", "Version: 1.7.10")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.BLACK)
                // Map Image
                .setImage("https://i.imgur.com/4HhdKWM.jpg")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // Calamity Caverns
        new SeriesEntry("cc", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("TELL KAISER TO GIVE CHIPMUNK A SERIES DESCRIPTION FOR HIS MAPS")
                .setAuthor("Calamity Caverns by Kaiser_2","https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/maps/maps-discussion/2461662-ctm-ctm-calamity-caverns-by-kaiser_2-new-mini","")
                // List of Maps
                .addInlineField("Catastrophic Caverns", "Version: 1.6.2-1.7.2")
                .addInlineField("Forgotten Depths", "Version: 1.7.2")
                .addInlineField("Unforgiving Caverns", "Version: 1.7.2")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.PINK)
                // Map Image
                .setImage("http://i1243.photobucket.com/albums/gg558/Alex_James_Callaghan/2016-02-24_22.26.16_zpsaz1nuofd.png")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // Chiefwiggy's CTM Series
        new SeriesEntry("chiefwiggy", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("NO DESCRIPTION FOR THIS MAP SERIES WRITE ONE AND PM TO CHIPMUNK")
                .setAuthor("Chief Wiggy's CTMs by Chiefwiggy","https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/maps/1534434-inspired-gallery-remastered-for-1-12-2-available","")
                // List of Maps
                .addInlineField("Deserted Caverns", "Version: 1.6.4")
                .addInlineField("Forgotten Crevice", "Version: 1.6.4")
                .addInlineField("Inspired Gallery", "Version: 1.6.4")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.ORANGE)
                // Map Image
                .setImage("https://i.imgur.com/4HhdKWM.jpg")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // Fornan's CTM Series INCOMPLETE
        new SeriesEntry("fornan", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("NO SERIES TELL FORNAN TO PM CHIPMUNK WITH SERIES DESCRIPTION")
                .setAuthor("Fornan2's CTM Series by Fornan2","https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/maps/2843439-fornans-map-collection#c1","")
                // List of Maps
                .addInlineField("The Broken Goddess", "Version: MAPVERSION")
                .addInlineField("The Discarded World", "Version: MAPVERSION")
                .addInlineField("Metro 2033", "Version: MAPVERSION")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.RED)
                // Map Image
                .setImage("https://i.imgur.com/4HhdKWM.jpg")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // Moldy's CTM Series INCOMPLETE
        new SeriesEntry("moldy", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("ADD DESCRIPTION HERE")
                .setAuthor("Moldy's CTMs by moldybread","","")
                // List of Maps
                .addInlineField("Depths of Irkalla", "Version: 1.6.4")
                .addInlineField("Into the Depths", "Version: 1.6.4")
                .addInlineField("Ticking Chill", "Version: 1.8")
                .addInlineField("Mage's Escape", "Version: 1.8")
                .addInlineField("Spectre Isles", "Version: 1.8")
                .addInlineField("Darkness Descending", "Version: 1.8")
                .addInlineField("Armageddon", "Version: 1.10")
                .addInlineField("Horizon's Edge", "Version: 1.10")
                .addInlineField("Forest's Heart", "Version: 1.10.2")
                .addInlineField("Pillar of Misery", "Version: 1.11.2")
                .addInlineField("Nyctophobia", "Version: 1.12.2")
                .addInlineField("Sea of Cinders", "Version: 1.12.2")
                .addInlineField("Expedition Entangled", "Version: 1.12.2")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.GREEN)
                // Map Image
                .setImage("https://cdn.discordapp.com/attachments/205875281553129490/414937151139217408/2018-02-18_18.22.23.png")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // The Angelical Shrine INCOMPLETE
        new SeriesEntry("tas", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("NO DESCRIPTION. PLEASE SUBMIT ONE FOR WALLCRAFT")
                .setAuthor("The Angelical Shrine by WallcraftMC","","")
                // List of Maps
                .addInlineField("A Little Fancy", "Version: 1.11.2")
                .addInlineField("Melonized Jungle", "Version: 1.11.2")
                .addInlineField("Frostbitten", "Version: 1.11.2")
                .addInlineField("Dome of Despair", "Version: 1.11.2")
                .addInlineField("Fantasy Paradise", "Version: 1.11.2")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.WHITE)
                // Map Image
                .setImage("https://pbs.twimg.com/media/CeajU5nW8AA47Yl.jpg")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // Simulation Protocol
        new SeriesEntry("sp", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("TELL SOMEONE TO WRITE A DESCRIPTION AND SEND IT TO CHIPMUNK")
                .setAuthor("Simulation Protocol by TikaroHD","http://www.minecraftforum.net/forums/mapping-and-modding/maps/1550497-ctm-collection-simulation-protocol-series-by","")
                // List of Maps
                .addInlineField("Animosity", "Version: 1.7.x")
                .addInlineField("Overload", "Version: 1.7.x")
                .addInlineField("Entropy", "Version: 1.12.2")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.YELLOW)
                // Map Image
                .setImage("https://images-ext-1.discordapp.net/external/8_Zmr_pa6ug57L6xB5xfP-AAFvDPAWte83dqL3PjaEE/https/i.imgur.com/osoC0vP.jpg?width=1215&height=650")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // Team CTMC INCOMPLETE
        new SeriesEntry("tctmc", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("ADD DESCRIPTION HERE")
                .setAuthor("SERIES NAME by AUTHOR","LINK TO MAP PAGE","")
                // List of Maps
                .addInlineField("MAPNAME", "Version: MAPVERSION")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.RED)
                // Map Image
                .setImage("IMAGE LINK")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // Uncharted Territory
        new SeriesEntry("ut", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("SOMEONE MAKE DESCRIPTION AND SEND TO CHIPMUNK")
                .setAuthor("Uncharted Territory by Amlup","https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/maps/1515043-amlups-uncharted-territory-series-new-map-in","")
                // List of Maps
                .addInlineField("Uncharted Territory 1", "Version: 1.3")
                .addInlineField("Uncharted Territory 2", "Version: 1.4.x")
                .addInlineField("Uncharted Territory 3", "Version: 1.6.2")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.WHITE)
                // Map Image
                .setImage("https://i.imgur.com/ueQfotq.jpg")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // Tales of Dreadsky INCOMPLETE
        new SeriesEntry("tod", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("ADD DESCRIPTION HERE")
                .setAuthor("SERIES NAME by AUTHOR","LINK TO MAP PAGE","")
                // List of Maps
                .addInlineField("MAPNAME", "Version: MAPVERSION")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.BLACK)
                // Map Image
                .setImage("IMAGE LINK")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // Tenebrous Tales
        new SeriesEntry("tt", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("Tenebrous Tales is a series of CTM maps developed by Thadiwyn.")
                .setAuthor("Tenebrous Tales by Thadiwyn","https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/maps/1500887-ctm-collection-thadiwyns-tenebrous-tales","")
                // List of Maps
                .addInlineField("Blight Castle", "Version: 1.6.4")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.CYAN)
                // Map Image
                .setImage("https://i.imgur.com/o9jD3.png")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // Vinyl Fantasy
        new SeriesEntry("vf", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("Vinyl Fantasy is a series of CTM maps developed by Three_Two.")
                .setAuthor("Vinyl Fantasy by Three_Two","https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/maps/1489847-three_twos-vinyl-fantasy-series","")
                // List of Maps
                .addInlineField("Vinyl Fantasy I", "Version: 1.1")
                .addInlineField("Vinyl Fantasy II", "Version: 1.2.5")
                .addInlineField("Industrial Park", "Version: 1.6.4")
                .addInlineField("Eventide Trance", "Version: 1.8.8")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.RED)
                // Map Image
                .setImage("https://i.imgur.com/pCkKI.jpg")
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
        // Map List
        new SeriesEntry("maplist", new EmbedBuilder()
        		.setTitle("Series Description")
                .setDescription("Vinyl Fantasy is a series of CTM maps developed by Three_Two.")
                .setAuthor("CTMC Maplist (Page 1)","","")
                // List of Maps
            
                .addInlineField("Chimarian Memories", "**Call Code:** cm")
                .addInlineField("Untold Stories", "**Call Code:** us")
                .addInlineField("Ragecraft", "**Call Code:** rc")
                .addInlineField("Super Hostile", "**Call Code:** sh")
                .addInlineField("Smitje's CTMs", "**Call Code:** smitje")
                .addInlineField("Omega's Odysseys", "**Call Code:** omega")
                .addInlineField("Forgotten Minis", "**Call Code:** fm")
                .addInlineField("YKnottalk's CTM Saga", "**Call Code:** ynot")
                .addInlineField("Cold Fusion's Maps", "**Call Code:** cfg")
                .addInlineField("The Legacy", "**Call Code:** legacy")
                .addInlineField("Vault of Adventure", "**Call Code:** voa")
                .addInlineField("Ty's CTM Collection", "**Call Code:** ty")
                .addInlineField("Extreme Adventures", "**Call Code:** ea")
                .addInlineField("Sybillian's CTMs", "**Call Code:** syb")
                .addInlineField("Project CTM", "**Call Code:** pctm")
                .addInlineField("Karrot's CTMs", "**Call Code:** karrot")
                .addInlineField("Journey of Creation", "**Call Code:** joc")
                .addInlineField("Deadly Realms", "**Call Code:** deadlyrealms")
                .addInlineField("Calamity Caverns", "**Call Code:** cc")
                .addInlineField("Chiefwiggy's CTM Series", "**Call Code:** chiefwiggy")
                .addInlineField("Fornan's CTM Series", "**Call Code:** fornan")
                .addInlineField("Moldy's CTM Series", "**Call Code:** moldy")
                //Footer
                .setFooter("Click on link above \"Series Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Embed Color
                .setColor(Color.GRAY)
                // CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png"))
            );

    List<MapEntry> mapList = Arrays.asList(
    		
    		 // maplist
  		   new MapEntry("maplist", "1", new EmbedBuilder()
  				 .setTitle("Series Description")
                 .setDescription("Vinyl Fantasy is a series of CTM maps developed by Three_Two.")
                 .setAuthor("CTMC Maplist (Page 1)","","")
                 // List of Maps
             
                 .addInlineField("Chimarian Memories", "**Call Code:** cm")
                 .addInlineField("Untold Stories", "**Call Code:** us")
                 .addInlineField("Ragecraft", "**Call Code:** rc")
                 .addInlineField("Super Hostile", "**Call Code:** sh")
                 .addInlineField("Smitje's CTMs", "**Call Code:** smitje")
                 .addInlineField("Omega's Odysseys", "**Call Code:** omega")
                 .addInlineField("Forgotten Minis", "**Call Code:** fm")
                 .addInlineField("YKnottalk's CTM Saga", "**Call Code:** ynot")
                 .addInlineField("Cold Fusion's Maps", "**Call Code:** cfg")
                 .addInlineField("The Legacy", "**Call Code:** legacy")
                 .addInlineField("Vault of Adventure", "**Call Code:** voa")
                 .addInlineField("Ty's CTM Collection", "**Call Code:** ty")
                 .addInlineField("Extreme Adventures", "**Call Code:** ea")
                 .addInlineField("Sybillian's CTMs", "**Call Code:** syb")
                 .addInlineField("Project CTM", "**Call Code:** pctm")
                 .addInlineField("Karrot's CTMs", "**Call Code:** karrot")
                 .addInlineField("Journey of Creation", "**Call Code:** joc")
                 .addInlineField("Deadly Realms", "**Call Code:** deadlyrealms")
                 .addInlineField("Calamity Caverns", "**Call Code:** cc")
                 .addInlineField("Chiefwiggy's CTM Series", "**Call Code:** chiefwiggy")
                 .addInlineField("Fornan's CTM Series", "**Call Code:** fornan")
                 .addInlineField("Moldy's CTM Series", "**Call Code:** moldy")),
 		   new MapEntry("maplist", "2", new EmbedBuilder()
 				  .setTitle("Series Description")
                  .setDescription("Vinyl Fantasy is a series of CTM maps developed by Three_Two.")
                  .setAuthor("CTMC Maplist (Page 2)","","")
                  // List of Maps
                  .addInlineField("The Angelical Shrine", "**Call Code:** tas")
                  .addInlineField("Simulation Protocol", "**Call Code:** sp")
                  .addInlineField("Uncharted Territories", "**Call Code:** ut")
                  .addInlineField("Team CTMC", "**Call Code:** tctmc")
                  .addInlineField("Tales of Dreadsky", "**Call Code:** tod")
                  .addInlineField("Tenebrous Tales", "**Call Code:** tt")
                  .addInlineField("Vinyl Fantasy", "**Call Code:** vf")),
    		// TEMPLATE
 		   new MapEntry("SERIESCODE", "MAPCODE", new EmbedBuilder()
	                .setTitle("Map Description")
	                .setDescription("MAP DESCRIPTION")
	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
	                // Fields
	                .addInlineField("Map Version", "MAPVERSION")
	                .addInlineField("Objectives", "OBJECTIVE #")
	                .addInlineField("Difficulty", "DIFFICULTYRATING")
	                // Embed Color
	                .setColor(Color.RED)
	                // Footer
	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
	                // Map Image
	                .setImage("MAPIMAGE")
	                //CTMC Logo
	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
 		   // Chimarian Memories
 		  new MapEntry("cm", "1", new EmbedBuilder()
	                .setTitle("Map Description")
	                .setDescription("Into the Storm is Chipmunk's first map in the CM series. Fight through vastly changing environments, brutal mobs, "
	                		+ "and an endless storm of mobs. Can you defeat it all?")
	                .setAuthor("Into the Storm by Chipmunk", "http://www.minecraftforum.net/forums/mapping-and-modding/maps/1554519-ctm-chimarian-memories-ctm-series-new-minimap", "")
	                // Fields
	                .addInlineField("Map Version", "1.7.4")
	                .addInlineField("Objectives", "20")
	                .addInlineField("Difficulty", "6")
	                // Embed Color
	                .setColor(Color.RED)
	                // Footer
	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
	                // Map Image
	                .setImage("http://i.imgur.com/AxXYvWr.png")
	                //CTMC Logo
	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
 		 new MapEntry("cm", "2", new EmbedBuilder()
	                .setTitle("Map Description")
	                .setDescription("The Hikaro Jungle has lied dormant for centuries. With the approaching Storm, the entire jungle is alive, and deadly. Can you survive?")
	                .setAuthor("Hikaro Jungle by Chipmunk", "http://www.minecraftforum.net/forums/mapping-and-modding/maps/1554519-ctm-chimarian-memories-ctm-series-new-minimap", "")
	                // Fields
	                .addInlineField("Map Version", "1.7.4")
	                .addInlineField("Objectives", "20")
	                .addInlineField("Difficulty", "5")
	                // Embed Color
	                .setColor(Color.RED)
	                // Footer
	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
	                // Map Image
	                .setImage("http://i.imgur.com/nGy5hjI.png")
	                //CTMC Logo
	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
 		new MapEntry("cm", "3", new EmbedBuilder()
                .setTitle("Map Description")
                .setDescription("After escaping the Hikaro, you end up in the ancient realm of Corralia. Fight using immense amounts of powerful loot against insane enemies and intense environments.")
                .setAuthor("Archangel Rising by Chipmunk", "http://www.minecraftforum.net/forums/mapping-and-modding/maps/1554519-ctm-chimarian-memories-ctm-series-new-minimap", "")
                // Fields
                .addInlineField("Map Version", "1.8.8")
                .addInlineField("Objectives", "20")
                .addInlineField("Difficulty", "3")
                // Embed Color
                .setColor(Color.RED)
                // Footer
                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Map Image
                .setImage("http://i.imgur.com/iXBI455.png")
                //CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
 		new MapEntry("cm", "4", new EmbedBuilder()
                .setTitle("Map Description")
                .setDescription("Now fighting against a ruthless fallen angel alongside an archangel, you must complete the monument and find the prophecy that will foretell Chimaria's fate in the war to come. Are you up to the task?")
                .setAuthor("Blood of the Oracle by Chipmunk", "http://www.minecraftforum.net/forums/mapping-and-modding/maps/1554519-ctm-chimarian-memories-ctm-series-new-minimap", "")
                // Fields
                .addInlineField("Map Version", "1.8.8")
                .addInlineField("Objectives", "16")
                .addInlineField("Difficulty", "5")
                // Embed Color
                .setColor(Color.RED)
                // Footer
                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Map Image
                .setImage("http://i.imgur.com/heyENlq.png")
                //CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // Untold Stories
 		new MapEntry("us", "goliath", new EmbedBuilder()
                .setTitle("Map Description")
                .setDescription("From forests to deserts. Go diving in the deepest oceans or go spelunking in the darkest caves. This map is an environment based map. It is extremely vast so that explains its name. It starts off relatively easy, but it gets harder and harder over time. But be wary, the map has a fair amount of traps")
                .setAuthor("Goliath by RenderXR", "LINK TO MAP", "")
                // Fields
                .addInlineField("Map Version", "MAPVERSION")
                .addInlineField("Objectives", "OBJECTIVE #")
                .addInlineField("Difficulty", "DIFFICULTYRATING")
                // Embed Color
                .setColor(Color.RED)
                // Footer
                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Map Image
                .setImage("MAPIMAGE")
                //CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
 		new MapEntry("us", "bigleafforest", new EmbedBuilder()
                .setTitle("Map Description")
                .setDescription("MAP DESCRIPTION")
                .setAuthor("MAPNAME by AUTHOR", "http://www.minecraftforum.net/forums/mapping-and-modding/maps/2295375-ctm-collection-renderxrs-untold-stories-series", "")
                // Fields
                .addInlineField("Map Version", "MAPVERSION")
                .addInlineField("Objectives", "OBJECTIVE #")
                .addInlineField("Difficulty", "DIFFICULTYRATING")
                // Embed Color
                .setColor(Color.RED)
                // Footer
                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Map Image
                .setImage("MAPIMAGE")
                //CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
 		new MapEntry("us", "myriadcaves", new EmbedBuilder()
                .setTitle("Map Description")
                .setDescription("MAP DESCRIPTION")
                .setAuthor("MAPNAME by AUTHOR", "http://www.minecraftforum.net/forums/mapping-and-modding/maps/2295375-ctm-collection-renderxrs-untold-stories-series", "")
                // Fields
                .addInlineField("Map Version", "MAPVERSION")
                .addInlineField("Objectives", "OBJECTIVE #")
                .addInlineField("Difficulty", "DIFFICULTYRATING")
                // Embed Color
                .setColor(Color.RED)
                // Footer
                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Map Image
                .setImage("MAPIMAGE")
                //CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
 		new MapEntry("us", "coronatrials", new EmbedBuilder()
                .setTitle("Map Description")
                .setDescription("MAP DESCRIPTION")
                .setAuthor("MAPNAME by AUTHOR", "http://www.minecraftforum.net/forums/mapping-and-modding/maps/2295375-ctm-collection-renderxrs-untold-stories-series", "")
                // Fields
                .addInlineField("Map Version", "MAPVERSION")
                .addInlineField("Objectives", "OBJECTIVE #")
                .addInlineField("Difficulty", "DIFFICULTYRATING")
                // Embed Color
                .setColor(Color.RED)
                // Footer
                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Map Image
                .setImage("MAPIMAGE")
                //CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
 		new MapEntry("us", "calamitycanyon", new EmbedBuilder()
                .setTitle("Map Description")
                .setDescription("MAP DESCRIPTION")
                .setAuthor("MAPNAME by AUTHOR", "http://www.minecraftforum.net/forums/mapping-and-modding/maps/2295375-ctm-collection-renderxrs-untold-stories-series", "")
                // Fields
                .addInlineField("Map Version", "MAPVERSION")
                .addInlineField("Objectives", "OBJECTIVE #")
                .addInlineField("Difficulty", "DIFFICULTYRATING")
                // Embed Color
                .setColor(Color.RED)
                // Footer
                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
                // Map Image
                .setImage("MAPIMAGE")
                //CTMC Logo
                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // Ragecraft
    		   new MapEntry("rc", "1", new EmbedBuilder()
    	                .setTitle("Series Description")
    	                .setDescription("The Corrupted Path is the first in Heliceo's brutally difficult Ragecraft series. Fight through "
    	                		+ "ruthless caverns, battle myriads of mobs, and complete one of the most satisfying monuments you've ever seen.")
    	                .setAuthor("The Corrupted Path (RC1) by Heliceo", "http://www.minecraftforum.net/forums/mapping-and-modding/maps/1537478-ctm-ragecraft-series-by-heliceo", "")
    	                // Fields
    	                .addInlineField("Map Version", "1.5.2")
    	                .addInlineField("Objectives", "18")
    	                .addInlineField("Difficulty", "9")
    	                // Embed Color
    	                .setColor(Color.RED)
    	                // Footer
    	                .setFooter("Footer", "https://cdn.discordapp.com/embed/avatars/1.png%22")
    	                // Map Image
    	                .setImage("https://i.imgur.com/EeG0e0n.jpg")
    	                //CTMC Logo
    	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("rc", "2", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("Insomnia is the second map of Heliceo's Ragecraft series and is commonly seen as one of the greatest CTM maps ever. "
   	                		+ "Fight through vast landscapes in the hopes of completing the monument, at the threat of your very sanity.")
   	                .setAuthor("Insomnia (RC2) by Heliceo", "http://www.minecraftforum.net/forums/mapping-and-modding/maps/1537478-ctm-ragecraft-series-by-heliceo", "")
   	                // Fields
   	                .addInlineField("Map Version", "1.7.2")
   	                .addInlineField("Objectives", "16")
   	                .addInlineField("Difficulty", "7")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("http://i.imgur.com/AN48mwz.jpg")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("rc", "3", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // Super Hostile
    		   new MapEntry("sh", "sof2", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("sh", "is2", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("sh", "kaizocaverns", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("sh", "legendary", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("sh", "nightmarerealm", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("sh", "sunburnislands", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("sh", "lethamyr", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("sh", "infernomines", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("sh", "wakingup", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("sh", "oldstuffpack", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("sh", "SHO", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // Smitje's CTMs
    		   new MapEntry("smitje", "corruptedisles", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // Omega's Odysseys
    		   new MapEntry("omega", "bonechillspiral", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // Forgotten Minis
    		   new MapEntry("fm", "hellfirequarry", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // Cold Fusion's Maps
    		   new MapEntry("cfg", "monstrosity", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("cfg", "frostburn", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // The Legacy
    		   new MapEntry("legacy", "nightmare", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("legacy", "citadelraiders", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("legacy", "instability", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // Vault of Adventure
    		   new MapEntry("voa", "legendsofargon", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // Ty's CTM Collection
    		   new MapEntry("ty", "undeadreturn", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("ty", "trustfall", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("ty", "prisonbreak", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("ty", "snowynightmare", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // Extreme Adventures
    		   new MapEntry("ea", "savagerealm", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("ea", "marooned", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("ea", "soulreaper", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("ea", "supposedgoldenpath", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("ea", "descentintodarkness", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("ea", "skywardascent", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("ea", "wildcharge", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // Sybillian's CTMs
    		   new MapEntry("syb", "royalfamily", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // Project CTM
    		   new MapEntry("pctm", "pantheon", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("pctm", "titansrevolt", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // Karrot's CTMs
    		   new MapEntry("karrot", "togreenerpastures", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // Journey of Creation
    		   new MapEntry("joc", "thepainter", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // Deadly Realms
    		   new MapEntry("deadlyrealms", "aimacaves", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // Calamity Caverns
    		   new MapEntry("cc", "catastrophiccaverns", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("cc", "forgottendepths", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("cc", "unforgivingcaverns", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // Chiefwiggy's CTM Series
    		   new MapEntry("chiefwiggy", "desertedcaverns", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("chiefwiggy", "forgottencrevice", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("chiefwiggy", "inspiredgallery", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // Fornan's CTM Series
    		   new MapEntry("fornan", "brokengoddess", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("fornan", "discardedworld", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("fornan", "metro2033", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // Moldy's CTM Series
    		   new MapEntry("moldy", "depthsofirkalla", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("moldy", "intothedepths", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("moldy", "tickingchill", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("moldy", "magesescape", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("moldy", "spectreisles", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("moldy", "darknessdescending", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("moldy", "armageddon", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("moldy", "horizonsedge", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("moldy", "forestsheart", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("moldy", "pillarofmisery", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("moldy", "nyctophobia", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("moldy", "seaofcinders", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("moldy", "expeditionentangled", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // The Angelical Shrine
    		   new MapEntry("tas", "littlefancy", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("tas", "melonizedjungle", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("tas", "frostbitten", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("tas", "domeofdespair", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("tas", "fantasyparadise", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // Simulation Protocol
    		   new MapEntry("sp", "1", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("sp", "2", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("sp", "3", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // Uncharted Territory
    		   new MapEntry("ut", "1", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("ut", "2", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("ut", "3", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // Team CTMC
    		   new MapEntry("tctmc", "MAPCODE", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("tctmc", "MAPCODE", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("tctmc", "MAPCODE", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // Tales of Dreadsky
    		   new MapEntry("tod", "MAPCODE", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // Tenebrous Tales
    		   new MapEntry("CALLCODE", "MAPCODE", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
            // Vinyl Fantasy
    		   new MapEntry("CALLCODE", "MAPCODE", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("CALLCODE", "MAPCODE", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("CALLCODE", "MAPCODE", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png")),
    		   new MapEntry("CALLCODE", "MAPCODE", new EmbedBuilder()
   	                .setTitle("Map Description")
   	                .setDescription("MAP DESCRIPTION")
   	                .setAuthor("MAPNAME by AUTHOR", "LINK TO MAP", "")
   	                // Fields
   	                .addInlineField("Map Version", "MAPVERSION")
   	                .addInlineField("Objectives", "OBJECTIVE #")
   	                .addInlineField("Difficulty", "DIFFICULTYRATING")
   	                // Embed Color
   	                .setColor(Color.RED)
   	                // Footer
   	                .setFooter("Click on link above \"Map Description\"", "https://cdn.discordapp.com/embed/avatars/1.png")
   	                // Map Image
   	                .setImage("MAPIMAGE")
   	                //CTMC Logo
   	                .setThumbnail("http://i.imgur.com/XEmaKVo.png"))
    );
    /* Change the Channel to whatever the type of event.getChannel() is */
    void myfunc(TextChannel channel, String user_input) {
        String[] args = user_input.split(" ");
        if (args.length == 2 && (args[0].equals("$callmap") || args[0].equals("$cm"))) {
            // This is a series request
            boolean found = false;
            for (SeriesEntry entry : seriesList) {
                if (entry.mSeries.equals(args[1])) {
                channel.sendMessage(entry.mEmbed);
                }
            }
            if (!found) {
                // Print "Sorry, didn't find request"
            }

        } else if (args.length == 3) {
            // This is a map request
            boolean found = false;
            for (MapEntry entry : mapList) {
                if (entry.mSeries.equals(args[1]) && entry.mName.equals(args[2])) {
                channel.sendMessage(entry.mEmbed);
                }
            }
            if (!found) {
                // Print "Sorry, didn't find request"
            }
        }
    }
}