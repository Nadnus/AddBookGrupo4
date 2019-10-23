package seedu.addressbook.ui;

import static seedu.addressbook.common.Messages.MESSAGE_GOODBYE;
import static seedu.addressbook.common.Messages.MESSAGE_INIT_FAILED;
import static seedu.addressbook.common.Messages.MESSAGE_PROGRAM_LAUNCH_ARGS_USAGE;
import static seedu.addressbook.common.Messages.MESSAGE_USING_STORAGE_FILE;
import static seedu.addressbook.common.Messages.MESSAGE_WELCOME;

public class Formatter {
    public final String LINE_PREFIX = "|| ";
    public final String DIVIDER = "===================================================";
    public final String LS = System.lineSeparator();

    public String welcomemessage(String version, String storageFileInfo) {
        String value = LINE_PREFIX + DIVIDER + "\n" + LINE_PREFIX + DIVIDER + "\n" + LINE_PREFIX + MESSAGE_WELCOME.replace("\n", LS + LINE_PREFIX) + "\n" + LINE_PREFIX + version.replace("\n", LS + LINE_PREFIX) + "\n" + LINE_PREFIX + MESSAGE_PROGRAM_LAUNCH_ARGS_USAGE.replace("\n", LS + LINE_PREFIX) + "\n" + LINE_PREFIX + storageFileInfo.replace("\n", LS + LINE_PREFIX) + "\n" + LINE_PREFIX + DIVIDER;
        return value;
    }
}
