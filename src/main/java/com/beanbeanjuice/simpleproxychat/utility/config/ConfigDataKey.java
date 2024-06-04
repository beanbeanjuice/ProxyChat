package com.beanbeanjuice.simpleproxychat.utility.config;

public enum ConfigDataKey {
    // CONFIG
    USE_DISCORD,
    BOT_TOKEN,
    CHANNEL_ID,
    BOT_ACTIVITY_TYPE,
    BOT_ACTIVITY_TEXT,
    SERVER_UPDATE_INTERVAL,
    ALIASES,
    USE_PERMISSIONS,
    PROXY_MESSAGE_PREFIX,
    USE_INITIAL_SERVER_STATUS,
    USE_FAKE_MESSAGES,
    TIMESTAMP_USE_API,
    TIMESTAMP_FORMAT,
    TIMESTAMP_TIMEZONE,
    USE_HELPER,
    UPDATE_NOTIFICATIONS,

    // MESSAGES
    PLUGIN_PREFIX,

    MINECRAFT_JOIN_ENABLED,
    MINECRAFT_JOIN,
    MINECRAFT_LEAVE_ENABLED,
    MINECRAFT_LEAVE,
    MINECRAFT_CHAT_ENABLED,
    MINECRAFT_CHAT_MESSAGE,
    MINECRAFT_SWITCH_ENABLED,
    MINECRAFT_SWITCH_DEFAULT,
    MINECRAFT_SWITCH_SHORT,
    MINECRAFT_DISCORD_ENABLED,
    MINECRAFT_DISCORD_MESSAGE,
    MINECRAFT_DISCORD_EMBED_USE,
    MINECRAFT_DISCORD_EMBED_TITLE,
    MINECRAFT_DISCORD_EMBED_MESSAGE,
    MINECRAFT_DISCORD_EMBED_COLOR,
    MINECRAFT_DISCORD_EMBED_USE_TIMESTAMP,
    MINECRAFT_COMMAND_NO_PERMISSION,
    MINECRAFT_COMMAND_UNKNOWN,
    MINECRAFT_COMMAND_MUST_BE_PLAYER,
    MINECRAFT_COMMAND_RELOAD,
    MINECRAFT_COMMAND_CHAT_LOCK_USAGE,
    MINECRAFT_COMMAND_CHAT_LOCK_SINGLE_LOCKED,
    MINECRAFT_COMMAND_CHAT_LOCK_SINGLE_UNLOCKED,
    MINECRAFT_COMMAND_CHAT_LOCK_ALL_LOCKED,
    MINECRAFT_COMMAND_CHAT_LOCK_ALL_UNLOCKED,

    DISCORD_JOIN_ENABLED,
    DISCORD_JOIN_MESSAGE,
    DISCORD_JOIN_USE_TIMESTAMP,
    DISCORD_LEAVE_ENABLED,
    DISCORD_LEAVE_MESSAGE,
    DISCORD_LEAVE_USE_TIMESTAMP,
    DISCORD_SWITCH_ENABLED,
    DISCORD_SWITCH_MESSAGE,
    DISCORD_SWITCH_USE_TIMESTAMP,
    DISCORD_CHAT_ENABLED,
    DISCORD_CHAT_MINECRAFT_MESSAGE,
    DISCORD_TOPIC_ONLINE,
    DISCORD_TOPIC_OFFLINE,
    DISCORD_PROXY_STATUS_ENABLED,
    DISCORD_PROXY_STATUS_MODULE_ENABLED,
    DISCORD_PROXY_STATUS_MODULE_DISABLED,
    DISCORD_PROXY_STATUS_MODULE_TITLE,
    DISCORD_PROXY_STATUS_MODULE_MESSAGE,
    DISCORD_PROXY_STATUS_MODULE_ONLINE,
    DISCORD_PROXY_STATUS_MODULE_OFFLINE,
    DISCORD_PROXY_STATUS_MODULE_USE_TIMESTAMP,

    // CONSOLE STUFF
    CONSOLE_CHAT,
    CONSOLE_JOIN,
    CONSOLE_LEAVE,
    CONSOLE_SWITCH,
    CONSOLE_DISCORD_CHAT,
    CONSOLE_SERVER_STATUS,

    UPDATE_MESSAGE,

    // External
    VANISH_ENABLED,
    LUCKPERMS_ENABLED,
    LITEBANS_ENABLED,
    ADVANCEDBAN_ENABLED,
    NETWORKMANAGER_ENABLED,
    PLUGIN_STARTING
}
