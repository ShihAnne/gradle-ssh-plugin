package org.hidetake.gradle.ssh.ssh.api

import org.hidetake.gradle.ssh.api.Remote

/**
 * A factory of {@link Connection}.
 *
 * @author hidetake.org
 */
interface ConnectionManager {
    /**
     * Establish a connection.
     *
     * @param remote the remote host
     * @return a connection
     */
    Connection establish(Remote remote)

    /**
     * Wait for pending sessions.
     */
    void waitForPending()

    /**
     * Return if any connection was error.
     *
     * @return true if at least one was error
     */
    boolean isAnyError()

    /**
     * Cleanup all connections.
     */
    void cleanup()
}