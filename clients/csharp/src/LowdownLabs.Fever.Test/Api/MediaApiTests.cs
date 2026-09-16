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
    public class MediaApiTests : IDisposable
    {
        private MediaApi instance;

        public MediaApiTests()
        {
            instance = new MediaApi();
        }

        public void Dispose()
        {
        }

        [Fact]
        public void InstanceTest()
        {
        }

        [Fact]
        public void GetMediaBytesTest()
        {
        }

        [Fact]
        public void GetMediaInfoTest()
        {
        }

        [Fact]
        public void ListMediaFormatsTest()
        {
        }

        [Fact]
        public void ListMediaFramesTest()
        {
        }

        [Fact]
        public void ListMediaTranscriptTest()
        {
        }
    }
}
