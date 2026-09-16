using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using Xunit;

using LowdownLabs.Fever.Client;
using LowdownLabs.Fever.Api;

namespace LowdownLabs.Fever.Test.Api
{
    public class KeysApiTests : IDisposable
    {
        private KeysApi instance;

        public KeysApiTests()
        {
            instance = new KeysApi();
        }

        public void Dispose()
        {
        }

        [Fact]
        public void InstanceTest()
        {
        }

        [Fact]
        public void CreateKeyTest()
        {
        }

        [Fact]
        public void ListKeysTest()
        {
        }

        [Fact]
        public void RevokeKeyTest()
        {
        }
    }
}
