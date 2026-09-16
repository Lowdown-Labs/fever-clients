import unittest

from fever_client.api.media_api import MediaApi

class TestMediaApi(unittest.IsolatedAsyncioTestCase):

    async def asyncSetUp(self) -> None:
        self.api = MediaApi()

    async def asyncTearDown(self) -> None:
        await self.api.api_client.close()

    async def test_get_media_bytes(self) -> None:
        pass

    async def test_get_media_info(self) -> None:
        pass

    async def test_list_media_formats(self) -> None:
        pass

    async def test_list_media_frames(self) -> None:
        pass

    async def test_list_media_transcript(self) -> None:
        pass

if __name__ == '__main__':
    unittest.main()
