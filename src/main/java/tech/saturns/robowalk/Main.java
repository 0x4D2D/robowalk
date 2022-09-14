package tech.saturns.robowalk;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	public static boolean enabled = false;
	public static boolean debug = false;

	@Override
	public void onInitialize() {
	}
}
