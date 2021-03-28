
package com.googlesource.gerrit.plugins.random;

import java.util.UUID;
import com.google.inject.Singleton;

@Singleton
public class RandomApiImpl implements RandomApi {
  @Override
  public String generate() {
    return UUID.randomUUID().toString();
  }
}
