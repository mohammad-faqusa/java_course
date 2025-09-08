# Disabling AI Hints in IntelliJ IDEA Ultimate

If you’re seeing AI "hints" or suggestions in the editor (inline completions, gray ghost text, AI actions, gutter icons, code vision annotations, etc.), you can disable them in a few different ways depending on your preference.

Note: On Windows/Linux the menu is File > Settings. On macOS it’s IntelliJ IDEA > Preferences. The paths below refer to Settings; substitute Preferences on macOS.

## Option 1: Disable the AI Assistant plugin entirely (strongest)
1. Go to: File > Settings > Plugins > Installed
2. Find: AI Assistant (by JetBrains)
3. Click Disable and confirm.
4. Restart the IDE when prompted.

This removes the AI tool window, AI actions, inline suggestions, and other AI features provided by the plugin.

## Option 2: Keep the plugin but turn off AI features (granular)
If you want to keep the plugin installed but stop AI content from showing up:

1. Open: File > Settings > Tools > AI Assistant
2. Turn off the following (names may vary slightly depending on version):
   - Inline completion (Disable inline suggestions / Show inline code completion)
   - AI actions in editor and context menus
   - Inline chat in editor
   - Code insight, documentation, refactor or review features powered by AI (toggle off any listed here)
3. Apply and OK.

This preserves the plugin but suppresses editor‑level AI content.

## Option 3: Turn off non‑AI editor annotations that may look like “AI hints”
Sometimes what looks like an “AI hint” is actually Code Vision or Inlay Hints:

- Code Vision (method usage counts, authors, etc.):
  1. File > Settings > Editor > Code Vision
  2. Uncheck Enable Code Vision or disable specific providers.

- Inlay Hints (gray hints inside code, e.g., parameter names):
  1. File > Settings > Editor > Inlay Hints
  2. For each language you use, uncheck the categories you don’t want (e.g., Parameter hints, Types, etc.).

- Gutter icons/tooltips:
  1. File > Settings > Editor > General > Gutter Icons
  2. Uncheck any icons you don’t want to see.

## Option 4: Completion settings
If you are specifically seeing gray “ghost text” suggestions:
- Ensure Inline completion under File > Settings > Tools > AI Assistant is disabled (see Option 2).
- You can also adjust File > Settings > Editor > General > Code Completion if you want fewer suggestions in general (not AI‑specific), e.g., turning off auto‑popup or tuning filters.

## Privacy and data sharing (optional)
- Help > Data Sharing and Privacy Settings: You can opt out of sending usage statistics.
- File > Settings > Tools > AI Assistant: Review and disable any data‑collection toggles available in your version.

## Troubleshooting
- Don’t see the AI Assistant plugin? It may not be installed/enabled in your edition or managed by your organization.
- After changes, restart the IDE to ensure all hints are gone.
- If your organization enforces AI features via policy, you may need admin assistance.

If you want these settings tracked with your project/team, consider documenting them here so everyone can configure their IDE consistently.