package com.mindforge.app

/**
 * Specifies the type of a linked node, i.e. how the hyperlink property is handled.
 * The idea behind this is to use an url format that allows compatibility with XMind,
 * i.e clicking the link there allows the user to navigate to the content that we represent as subnodes.
 */
enum class LinkType {
    /** Nothing happens... */
    None
    /** The hyperlink is a 'regular' link to a web site. */
    WebUrl
    /** The hyperlink references an Evernote notebook */
    Evernote
    /** The hyperlink references a Gmail inbox */
    Gmail
}
